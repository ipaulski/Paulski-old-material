//Izabella Paulski p06 polynomial CS318 polynomial.h

#ifndef __POLYNOMIAL_H_
#define __POLYNOMIAL_H_

#include <iostream>
#include <string>
#include <list>

using namespace std;

template<typename NumT>
class Monomial
{
public:
	Monomial<NumT>(NumT c = 0, int d = 0) : coeff(c), expo(d)
	{ };
	NumT coefficient(void) const { return coeff; };
	int degree(void) const { return expo; };
	void assign_coefficient(const NumT c) { coeff = c; };
	void assign_degree(const int d) { expo = d; };
	bool operator==(const Monomial<NumT>& m) const
	{
		return (coeff == m.coeff && expo == m.expo);
	}
	bool operator!=(const Monomial<NumT>& m) const
	{
		return (coeff != m.coeff || expo != m.expo);
	}
private:
	NumT coeff;
	int	expo;
};

template <typename NumberType>
class Polynomial
{
public:
	Polynomial<NumberType>(NumberType c = 0, int d = 0)
	{
		const Monomial<NumberType> m(c, d);
		term_list.push_back(m); //creates at least one monomial
		number_of_terms = 1;
		highest_degree = d;
	}
	Polynomial<NumberType>(const Monomial<NumberType>& m) //type conversion constructor
	{
		term_list.push_back(m);
		number_of_terms = 1;
		highest_degree = m.degree();
	}
	~Polynomial<NumberType>() { } // use default destructors and list's destructor

	Polynomial<NumberType>(const Polynomial<NumberType>& rhs)   // copy constructor
		: term_list(rhs.term_list), number_of_terms(rhs.number_of_terms), highest_degree(rhs.highest_degree)
	{ }

	//copy assignment
	const Polynomial<NumberType>& operator=(const Polynomial<NumberType>& rhs)
	{
		if (this == &rhs)
		{
			term_list.clear();
			term_list = move(rhs.term_list);
			highest_degree = rhs.highest_degree;
			number_of_terms = rhs.number_of_terms;
		}
		return *this;
	}

	//R-val reference
	const Polynomial<NumberType>& operator=(const Polynomial<NumberType>&& rhs)
	{
		if (this != &rhs)
		{
			term_list.clear();
			term_list = move(rhs.term_list);
			highest_degree = rhs.highest_degree;
			number_of_terms = rhs.number_of_terms;
		}
		return *this;
	}

	Polynomial<NumberType> operator+=(const Monomial<NumberType>& m)
	{
		insert_in_poly(*this, m);
		return *this;
	}

	Polynomial<NumberType> operator+=(const Polynomial<NumberType>& rhs)
	{
		for (const auto& x : rhs.term_list)
		{
			*this += x;
		}

		return *this;
	}

	const Polynomial<NumberType> operator+ (const Monomial<NumberType>& m) const
	{
		return Polynomial(*this) += m;
	}

	const Polynomial<NumberType> operator+ (const Polynomial<NumberType>& rhs) const
	{
		return Polynomial(*this) += rhs;
	}

	Polynomial<NumberType> operator-=(const Monomial<NumberType>& m)
	{
		Monomial<NumberType> tmp = m;
		tmp.assign_coefficient(-1 * (tmp.coefficient()));
		insert_in_poly(*this, tmp);

		return *this;
	}

	Polynomial<NumberType> operator-=(const Polynomial<NumberType>& rhs)
	{
		for (const auto& x : rhs.term_list)
		{
			*this -= x;
		}

		return *this;
	}

	const Polynomial<NumberType> operator- (const Monomial<NumberType>& m) const
	{
		return Polynomial(*this) -= m;
	}

	const Polynomial<NumberType> operator- (const Polynomial<NumberType>& rhs) const
	{
		return Polynomial(*this) -= rhs;
	}

	Polynomial<NumberType> operator*=(const Monomial<NumberType>& m)
	{
		Monomial<NumberType> tmp(m);
		auto x = Polynomial<NumberType>(tmp.coefficient(), tmp.degree());
		*this *= x;

		return *this;
	}

	Polynomial<NumberType> operator*=(const Polynomial<NumberType>& rhs)
	{
		Polynomial<NumberType> tmpP;
		Monomial<NumberType> tmpM;

		for (const auto& x : this->term_list)
		{
			for (const auto& y : rhs.term_list)
			{
				tmpM.assign_coefficient(x.coefficient() * y.coefficient());
				tmpM.assign_degree(x.degree() + y.degree());
				insert_in_poly(tmpP, tmpM);
			}
		}
		*this = tmpP;

		return *this;
	}

	const Polynomial<NumberType> operator*(const Monomial<NumberType>& m) const
	{
		return Polynomial(*this) *= m;
	}

	const Polynomial<NumberType> operator*(const Polynomial<NumberType>& rhs) const
	{
		return Polynomial(*this) *= rhs;
	}

	const NumberType evaluate(NumberType m)
	{
		int num = 0;

		for (auto& x : this->term_list)
		{
			num += x.coefficient() * power(m, x.degree());
		}

		return num;
	}

	bool operator==(const Polynomial<NumberType>& p) const
	{
		return (Polynomial(*this) == p);
	}

	bool operator!=(const Polynomial<NumberType>& p) const
	{
		return (Polynomial(*this) != p);
	}

	void read(istream& in = cin)
	{
		Monomial<NumberType> temp;

		while (true) {
			int coeff;
			int exp;
			in >> coeff;
			if (coeff == 0)
				break;
			in >> exp;

			temp.assign_coefficient(coeff);
			temp.assign_degree(exp);

			insert_in_poly(*this, temp);
		}
	}
	void print(ostream& out = cout) const
	{
		for (auto i = term_list.begin(); i != term_list.end(); i++)
		{
			if ((*i).coefficient() != 0)   //_x^_ + 
			{
				out << (*i).coefficient();
			}

			else if ((*i).degree() != 0)
			{
				out << "x";
			}

			else if ((*i).degree() > 1)
			{
				out << "^" << (*i).degree();
			}

			else if ((*i).coefficient() > 0)
			{
				out << " + ";
			}

			else {
				out << "0";
			}

		}
	}

private:
	list<Monomial<NumberType> > term_list; //sorted by decreasing degrees
	int number_of_terms;
	int highest_degree;

	//private helper member function
	void insert_in_poly(Polynomial<NumberType>& p, const Monomial<NumberType>& m) {
		if (p.number_of_terms == 0 && p.highest_degree == 0)
		{
			p.term_list.push_back(m);
			number_of_terms++;
			highest_degree = m.degree();
		}
		else
		{
			auto cur = p.term_list.begin(); //current iterator
			while (cur != p.term_list.end())
			{
				Monomial<NumberType> curM = *cur;
				if (curM.degree() == m.degree())
				{
					if ((curM.coefficient() + m.coefficient()) == 0)
					{
						cur = p.term_list.erase(cur);
						p.number_of_terms--;
						if (p.number_of_terms == 0)
						{
							p.highest_degree = 0;
							p.term_list.push_back(Monomial<NumberType>(0, 0));
						}
						else
						{
							p.highest_degree = curM.degree();
						}
					}
					else
					{
						curM.assign_coefficient(curM.coefficient() + m.coefficient());
					}
				}
				else if (curM.degree() > m.degree())
				{
					p.term_list.insert(cur, m); //first in the list
					number_of_terms++;
					p.highest_degree = curM.degree();
				}
				else
				{
					p.term_list.push_back(m);
					number_of_terms++;
				}
			}

		}
	}

	NumberType power(NumberType x, int n) const
	{
		NumberType num;
		num = pow(double(x), double(n));
		return num;
	}
};

template<typename NumberType>
istream& operator>>(istream& in, Polynomial<NumberType>& rhs)
{
	rhs.read();
	return in;
}

template<typename NumberType>
ostream& operator<<(ostream& out, const Polynomial<NumberType>& rhs)
{
	rhs.print();
	return out;
}
#endif

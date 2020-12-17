#ifndef COMPLEX_H
#define COMPLEX_H

#include <iostream>

using namespace std;

class complex
{
private:
	double re, im; //Cartesian canonical form

public:
	//constructors
	complex()
	{
		re = 0.0;
		im = 0.0;
	} // default constructor that should initialize to (0,0).
	complex(double a)
	{
		re = a;
		im = 0.0;
	} // constructor and also used for double-to-complex conversion
	complex(double a, double b)
	{
		re = a;
		im = b;
	} // constructor of Cartesian coordinate representation 
	complex(const complex& c)
	{
		re = c.re;
		im = c.im;
	} // copy constructor

	//assignment operation(-)
	complex& operator= (const complex& rhs);
	// copy values from rhs object and also return reference to current object

	//class complex member arithmetic and additional assignment operators +=, -=, *=, /=
	complex& operator+=(const complex& z);
	complex& operator+=(const double x); // for use of conversions

	complex& operator-=(const complex& z);
	complex& operator-=(const double x);

	complex& operator*=(const complex& z);
	complex& operator*=(const double x);

	complex& operator/=(const complex& z);
	complex& operator/=(const double x);

	//accessors
	double real() const
	{
		return re;
	}
	double imag() const
	{
		return im;
	}
	double magnitude() const
	{
		return sqrt(pow(re, 2) + pow(im, 2));
	} //also known as absolute value of a complex number
};

//binary arithmetic helper functions
//addition
complex operator+(const complex& z1, const complex& z2);
complex operator+(const complex& z1, const double x);
complex operator+(const double x, const complex& z1);
//subtraction
complex operator-(const complex& z1, const complex& z2);
complex operator-(const complex& z1, const double x);
complex operator-(const double x, const complex& z1);
//multiplication
complex operator*(const complex& z1, const complex& z2);
complex operator*(const complex& z1, const double x);
complex operator*(const double x, const complex& z1);
//division
complex operator/(const complex& z1, const complex& z2);
complex operator/(const complex& z1, const double x);
complex operator/(const double x, const complex& z1);

//unary arithemetic helper function
complex operator+(const complex& z);
complex operator- (const complex& z);

//comparison helper functions
bool operator==(const complex& z1, const complex& z2);
bool operator!=(const complex& z1, complex& z2);

//i/o
istream& operator>>(istream& in, complex& num);
ostream& operator<<(ostream& out, complex& num);

//other helper functions
double magnitude(const complex& z);
double real(const complex& z);
double imag(const complex& z);
complex polar(const double r, const double theta);
complex polar(const double r);
complex conj(const complex& z);
double norm(const complex& z);
double arg(const complex& z);

#endif
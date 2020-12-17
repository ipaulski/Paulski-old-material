#include "complex.h"
#include <iostream>
#include <cmath>

using namespace std;

/////////////////////////////////////////////////////////////////
//Assignment operation (=)
/////////////////////////////////////////////////////////////////

complex& complex::operator= (const complex& rhs)
{
	re = rhs.re;
	im = rhs.im;
	return *this;
}

/////////////////////////////////////////////////////////////////
//Class complex member arithmetic and additional assignment operators +=, -=, *=, /=
/////////////////////////////////////////////////////////////////

//addition
complex& complex::operator+=(const complex& z) 
{
	re += z.re;
	im += z.im;
	return *this;
}

complex& complex::operator+=(const double x) 
{
	re += x;
	return *this;
}

//subtraction
complex& complex::operator-=(const complex& z) 
{
	re -= z.re;
	im -= z.im;
	return *this;
}

complex& complex::operator-=(const double x) 
{
	re -= x;
	return *this;
}

//multiplication
complex& complex::operator*=(const complex& z) 
{
	double re_temp = (re * z.re) - (im * z.im);
	double im_temp = (re * z.im) + (im * z.re);
	re = re_temp;
	im = im_temp;
	return *this;
}

complex& complex::operator*=(const double x) 
{
	re *= x;
	im *= x;
	return *this;
}

//division
complex& complex::operator/=(const complex& z) 
{
	double re_temp = ((re * z.re) + (im * z.im)) / (z.re * z.re + z.im * z.im);
	double im_temp = ((im * z.re) - (re * z.im)) / (z.re * z.re + z.im * z.im);
	re = re_temp;
	im = im_temp;
	return *this;
}

complex& complex::operator/=(const double x) 
{
	re /= x;
	im /= x;
	return *this;
}

/////////////////////////////////////////////////////////////////
//binary arithmetic helper functions
/////////////////////////////////////////////////////////////////

//addition
complex operator+(const complex& z1, const complex& z2) 
{
	return (complex(z1) += complex(z2));
}

complex operator+(const complex& z1, const double x) 
{
	return (complex(z1) += x);
}

complex operator+(const double x, const complex& z) 
{
	return (complex(z) += x);
}

//subtraction
complex operator-(const complex& z1, const complex& z2) 
{
	return (complex(z1) -= complex(z2));
}

complex operator-(const complex& z1, const double x) 
{
	return (complex(z1) -= x);
}

complex operator-(const double x, const complex& z1) 
{
	return (complex(z1) -= x);
}

//multiplication 
complex operator*(const complex& z1, const complex& z2)
{
	return (complex(z1) *= complex(z2));
}

complex operator*(const complex& z1, const double x)
{
	return (complex(z1) *= x);
}

complex operator*(const double x, const complex& z1)
{
	return (complex(z1) *= x);
}

//division
complex operator/(const complex& z1, const complex& z2)
{
	return (complex(z1) /= complex(z2));
}

complex operator/(const complex& z1, const double x)
{
	return (complex(z1) /= x);
}

complex operator/(const double x, const complex& z1)
{
	return (complex(z1) /= x);
}

/////////////////////////////////////////////////////////////////
//unary arithmetic helper functions
/////////////////////////////////////////////////////////////////

complex operator+(const complex& z)
{
	return complex(z);
}

complex operator- (const complex& z)
{
	return complex(-z.real(), -z.imag());
}

/////////////////////////////////////////////////////////////////
//comparison  helper functions
/////////////////////////////////////////////////////////////////

bool operator==(const complex& z1, const complex& z2) 
{
	return((z1.real() == z2.real()) && (z1.imag() == z2.imag()));
}
bool operator!=(const complex& z1, complex& z2) 
{
	return((z1.real() != z2.real()) || (z1.imag() != z2.imag()));
}

/////////////////////////////////////////////////////////////////
//I/O  helper functions
/////////////////////////////////////////////////////////////////

istream& operator>>(istream& in, complex& c) 
{
	double real, imag;
	real = c.real();
	imag = c.imag();
	in.ignore(); //ignores (
	in >> real;
	in.ignore(); //ignores ,
	in >> imag;
	in.ignore(); //ignores )
	c = complex(real, imag);
	return in;
}// input and parse complex literals of form: (a, b)

ostream& operator<<(ostream& out, complex& c) 
{
	out << "(" << c.real() << "," << c.imag() << ")";
	return out;
}// Output the complex number in the form: (a, b)

/////////////////////////////////////////////////////////////////
//other  helper functions
/////////////////////////////////////////////////////////////////

double magnitude(const complex& z)
{
	return sqrt(norm(complex(z)));
}

double real(const complex& z) 
{
	return z.real();
}

double imag(const complex& z) 
{
	return z.imag();
} 

complex polar(const double r, const double theta)
{
	double a, b;
	a = r * (cos(theta));
	b = r * (sin(theta));
	return complex(a,b);
}

complex polar(const double r)
{
	return complex(r);
}

complex conj(const complex& z)
{
	return complex(z.real(), -(z.imag()));
}

double norm(const complex& z)
{
	return sqrt((z.real() * z.real()) + (z.imag() * z.imag()));
}

double arg(const complex& z)
{
	return atan2(z.imag(), z.real());
}
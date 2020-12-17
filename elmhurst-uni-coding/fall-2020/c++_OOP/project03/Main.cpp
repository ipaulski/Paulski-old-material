// SAMPLE TEST SUITE structure. YOU MUST COMPLETE MANY MORE TESTS
// Test Suite for complex number class
// Written: Izabella Paulski
// Date: Fall 2020

#include <iostream>
#include "complex.h"
#include <cmath>
#include <assert.h>

// small namespace that could be expanded with large number of mathematical
//constants
namespace MY_MATH {
	const double PI = 3.141592653589793;
}
using namespace std;
// test function that drives multiple infix operators over complex and double
//arguments
complex f(const complex& z)
{
	return z * z * z - 3 * z * z + 4 * z - 2;
}
//approx_value is used for testing equivalent values of type double
inline bool approx_value(double x, double y) {
	return (y - .0001 <= x && x <= y + .0001);
}
bool assertx(bool expr, unsigned line) {
	if (!expr) cerr << "Error at line" << line << endl; return expr;
}
int main()
{
	const complex i(0, 1); // complex number i = 0 +1i
	complex z1, z2, z3;
	complex z4 = complex(1, 2);
	complex complex_number[] = { complex(2,3), complex(-1,1), complex(1,1),
	complex(1,-1), complex(1,0) };
	complex sum = 0.0;
	double x1;
	double y1;
	//testing assignment-related operators
	z1 = complex{ 3, 2 };
	z2 = complex{ -4, 3 };
	z4 = z3;
	z3 += z2;
	assertx(z3 == z2, __LINE__);
	z3 -= z2;
	assertx(z4 == z3, __LINE__);
	z3 *= z2;
	z3 /= z2;
	assertx(z3 == z4, __LINE__);
	x1 = z3.real();
	y1 = z3.imag();
	const double C = 3.0;
	z3 += C;
	assertx((z3.real() == (x1 + C)) && (z3.imag() == y1), __LINE__);
	z3 -= C;
	assertx((z3.real() == x1) && (z3.imag() == y1), __LINE__);
	z3 *= C;
	assertx((z3.real() == (x1 * C)) && (z3.imag() == (y1 * C)), __LINE__);
	z3 /= C;
	assertx((z3.real() == x1) && (z3.imag() == y1), __LINE__);

   //testing infix operators
	assertx((z1 + z2) == complex(-1, 5), __LINE__);
	assertx(z1 == complex(3, 2), __LINE__);
	assertx(z2 == complex(-4, 3), __LINE__);

	z1 = complex{ 2, 3 }; //note change of value bound to z1
	assertx(z1.real() == 2.0, __LINE__);
	assertx(z1.imag() == 3.0, __LINE__);
	assertx(real(z1) == 2.0, __LINE__);
	assertx(imag(z1) == 3.0, __LINE__);
	assertx(z1.magnitude() == sqrt(z1.real() * z1.real() + z1.imag() * z1.imag()), __LINE__);
	
	assertx(arg(complex(1., 0.)) == 0.0, __LINE__);
	assertx(approx_value(arg(complex(0, 1)), MY_MATH::PI / 2.0), __LINE__);
	assertx(approx_value(arg(complex(-1, 0)), MY_MATH::PI), __LINE__);

	// evaluate f(z), z = 2+3i, -1+i, 1+i, 1-i, 1+0i
	assertx(f(complex_number[0]) == complex(-25, -15), __LINE__);
	assertx(f(complex_number[1]) == complex(-4, 12), __LINE__);

	//testing istream and ostream
	cout << "Input a complex number in the form (a, b): ";
	complex in;
	cin >> in;
	cout << "\nThe complex number is: " << in << "\n";

	//testing helper functions
	//assertx(norm(complex(2,4) == sqrt((2 * 2) + (4 * 4))), __LINE__);
	assertx(conj(complex(2,4)) == complex(2,-4), __LINE__);
	assertx(polar(4) == complex(4,0), __LINE__);
	assertx(polar(64,(MY_MATH::PI)) == complex(64*(cos(MY_MATH::PI)), 64*(sin(MY_MATH::PI))), __LINE__);
	
	return 0;
}
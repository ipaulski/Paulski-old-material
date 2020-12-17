//Izabella Paulski p06 polynomial CS318 driver.cpp

#include "Polynomial.h"
#include <iostream>
#include <list>

using namespace std;

int main() 
{
	
typedef Monomial<int> m1;
typedef Polynomial<int> p1;

Polynomial<int> x;

cout << "Empty polynomial: " << x << endl;

Polynomial<int> y;

cin >> y;

cout << y << endl;

x += Monomial<int>(4,3);
cout << "Polynomial after addition: " << x << endl;

x *= Monomial<int>(2,2);
cout << "Polynomial after multiplication: " << x << endl;

x -= Monomial<int>(1,1);
cout << "Polynomial after subtraction: " << x << endl;

cout << "x = y? " << boolalpha << (x==y) << endl;

double eval = x.evaluate(2);
cout << "Polynomial after evaluation: " << x << endl;

Polynomial<int> z;

z = y;
cout << "Polynomial after it is equal to y: " << z << endl;
cout << "z = y? " << boolalpha << (z != y) << endl;


return 0;
}


//Izabella Paulski 
//CS318 Project 01 Quadratic Roots

#include <iostream> 
#include <string>
#include <math.h>

using namespace std;

void getRoots(double a, double b, double c);

int main() {
	string userInput = "";
	double a = 0.0, b = 0.0, c = 0.0;
	int space = 1;

	cout << "Program computes and prints the real roots of a quadratic polynomial a*x^2 + b*x + c.\n\n" ;
	cout << "Enter three real numbers a, b, and c, separated by spaces: ";

	getline(cin, userInput);

	cout << "\n";

	userInput += " ";

	string temp = "";

	for (int i = 0; i < userInput.length(); i++) {
		if (userInput[i] != ' ') {
			temp += userInput[i];
		}
		else {
			if (space == 1) {
				a = stod(temp.c_str());
				space++;
				temp = "";
			}
		
			else if (space == 2) {
				b = stod(temp.c_str());
				space++;
				temp = "";
			}

			else if (space == 3) {
				c = stod(temp.c_str());
				space++;
				temp = "";
			}
		}
	}

	getRoots(a, b, c);

	return 0;

}

void getRoots(double a, double b, double c) {
	double root1 = 0.0;
	double root2 = 0.0;

	// linear case a=0 b!=0
	if (a == 0 && b != 0) {
		root1 = -(c / b);
		cout << "The only root for the linear case of " << b << "*x + " << c << " = 0 is: " << root1 << "\n";
	}
	
	else if (a == 0 && b == 0 && c != 0) {
		cout << "No roots for the constant function " << c << "\n";
	}

	else if (a == 0 && b == 0 && c == 0) {
		cout << "No roots for the degenerate case of 0 = 0.\n";
	}

	else {
		int discrim = (b * b) - 4 * a * c;
		if (discrim == 0) {
			root1 = (-b + sqrt((b * b) - (4 * a * c))) / (2*a);
			cout << "The quadratic polynomial " << a << "*x^2 + " << b << "*x + " << c << " has two equal real roots:\nroot1 = root2 = " << root1 << "\n";
		}
		else if (discrim > 0) {
			root1 = (-b + sqrt((b * b) - (4 * a * c))) / (2 * a);
			root2 = (-b - sqrt((b * b) - (4 * a * c))) / (2 * a);
			cout << "The quadratic polynomial " << a << "*x^2 + " << b << "*x + " << c << " has two distinct real roots:\nroot1 = " << root1 << " and root2 = " << root2 << "\n";
		}
		else if (discrim < 0) {
			cout << "The quadratic polynomial " << a << "*x^2 + " << b << "*x + " << c << " has two complex roots." << "\n";
		}
	}


}

//Izabella Paulski
//CS318 P02 BullsAndCows

#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <vector>
#include <string>

using namespace std;

void checkErrors();

extern int Bulls{ 0 }, Cows{ 0 }, numOfGuesses{ 0 }, strToInt{ 0 };
extern string s{ "" }, playAgain{ "Y" }, yesOrNo{ "" };
extern bool tryAgain{ false }, dupe{ false }, lengthError{ false }, notADigit{ false };

int main() {
	vector<int> numToGuess;
	vector<int> guess;

	//initialize random seed
	srand(time(NULL));

	//generate 4 unique num between 0-9 and put into vector of int
	do {
		do {
			numToGuess.clear();

			for (int i = 0; i < 4; i++) {
				numToGuess.push_back(rand() % 10);
				if (numToGuess.size() > 1) {
					for (int j = 0; j <= i - 1; j++) {
						if (numToGuess[i] == numToGuess[j]) {
							numToGuess.erase(numToGuess.begin() + i);
							i--;
						}
					}
				}
			}
		} while (numToGuess.size() != 4);

		cout << "Number to Guess is ";

		for (int k = 0; k < numToGuess.size(); k++) {
			cout << numToGuess.at(k);
		}

		do {
			do {

				checkErrors();				

			} while (tryAgain);

			guess.clear();

			//take string input and convert into vector of int
			for (int aa = 0; aa < s.length(); aa++) {
				guess.push_back(s[aa] - '0');
			}
			
			Bulls = 0;
			Cows = 0;
			if (guess != numToGuess) {
				for (int r = 0; r < numToGuess.size(); r++) {
					if (guess[r] == numToGuess[r]) {
						Bulls++;
					}
					for (int x = 0; x < guess.size(); x++) {
						if (guess[r] == numToGuess[x] && r != x) {
							Cows++;
						}
					}
				}
				cout << "\nGuess #" << numOfGuesses << ": " << "Bulls " << Bulls << " Cows " << Cows;
			}

			else if (guess == numToGuess) {
				Bulls = 4;
				cout << "\nGuess #" << numOfGuesses << ": " << "Bulls " << Bulls << " Cows " << Cows;
				cout << "\n\n*** YOU WIN! ***";
			}

		} while (guess != numToGuess);
		yesOrNo = "";

		cout << "\nPlay again? Enter Y for yes and N for no.";

		cin >> yesOrNo;

	} while (playAgain == yesOrNo);

	return 0;
}

void checkErrors() {

	tryAgain = false;
	lengthError = false;
	notADigit = false;
	dupe = false;
	s = "";

	cout << "\n\nEnter guess -- 4 non-repeating digits (for example 4567): ";

	numOfGuesses++;

	cin >> s;

	if (s.length() != 4) {
		cout << "\nError: Guess must be 4 digits";
		tryAgain = true;
		lengthError = true;
	}

	else if (s.length() == 4) {
		for (int q = 0; q < s.length(); q++) {

			if (isdigit(s[q]) == false) {
				cout << "\nError: Guess must be 4 digits";
				tryAgain = true;
				notADigit = true;
			}

			for (int m = q; m < s.length(); m++) {
				if (s[q] == s[m + 1]) {
					dupe = true;
					tryAgain = true;
				}
			}
		}
	}

	if (dupe) {
		cout << "\nError: Digits can not be repeated";
	}

	Bulls = 0;
	Cows = 0;

	if (dupe || notADigit || lengthError) cout << "\nGuess #" << numOfGuesses << ": " << "Bulls " << Bulls << " Cows " << Cows;
}
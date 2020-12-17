//Izabella Paulski
//P04 Dorothy and Emeralds

#include <iostream>
#include <time.h>
#include <vector>
#include <algorithm>

using namespace std;

int numOfBaskets{ 0 }, minutes{ 0 }, emeralds{ 0 };

int main()
{
	cout << "**** Dorothy and Emeralds ****\n";
	cout << "\nEnter the number of baskets: ";
	cin >> numOfBaskets;
	cout << "\nEnter the number of minutes: ";
	cin >> minutes;

	//initialize random seed
	srand(time(NULL));

	//create vector
	vector<int> allBaskets;
	allBaskets.erase(allBaskets.begin(), allBaskets.end());

	//fill each basket with emeralds 1 through 100
	for (int m = 0; m < numOfBaskets; m++)
	{
		allBaskets.push_back(rand() % 100 + 1);
	}

	//sort
	std::sort(allBaskets.begin(), allBaskets.end());

	//print out
	for (auto i : allBaskets)
	{
		cout << i << " ";
	}

	//loop through minutes and gather emeralds
	for(int m = 0; m < minutes; m++)
	{
		//remove last element for dorothy and replace with E/2
		int temp = 0;
		temp = allBaskets.back();
		emeralds += allBaskets.back();
		allBaskets.pop_back();
		temp = temp / 2;
		allBaskets.push_back(temp);
		std::sort(allBaskets.begin(), allBaskets.end());
	}

	cout << "\nDorothy has gathered " << emeralds << " emeralds!";

	return 0;
}
//Izabella Paulski 
#include <iostream>
#include <list>

using namespace std;

//Problem 3.4
template <typename T> <T>
list<T> intersectionT(const list<T>& L1, const list<T>& L2)
{
	list<T> intersectionList;

	for(int i = L1.begin(); i != L1.size(); i++)
	{
		for(int j = L2.begin(); j != L2.size(); j++)
		{
			if(L1[i] < L2[j])
				i++;
			else if (L2[j] < L1[i])
				j++;
			else
			{
				intersectionList.push_back(L2[j]);
				cout << L2[j] << " ";
				i++;
				j++;
			}
		}
	}
}

list<T> unionT(const list<T>& L1, const list<T>& L2) 
{ 
    list<T> unionList;

	for(int i = L1.begin(); i != L1.size(); i++)
	{
		for(int j = L2.begin(); j != L2.size(); j++)
		{
			if(L1[i] < L2[j])
				unionList.push_back(L1[i++]);
			else if (L2[j] < L1[i])
				unionList.push_back(L2[j++]);
			else
			{
				unionList.push_back(L2[j++]);
				i++;
			}
			while(j < L2.size())
				unionList.push_back(L2[j++]);
		}
		while(i < L1.size())
			unionList.push_back(L1[i++]);
	}
}

/* Driver program to test above function */
int main() 
{ 
    list<T> arr1[] = { 1, 2, 4, 5, 6 }; 
    list<T> arr2[] = { 2, 3, 5, 7 }; 
  
    // Function calling 
    intersectionT(arr1, arr2); 
  	unionT(arr1, arr2); 

    return 0; 
} 
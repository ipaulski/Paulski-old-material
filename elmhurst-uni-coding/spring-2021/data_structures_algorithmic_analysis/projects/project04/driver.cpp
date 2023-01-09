#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <bitset>

using namespace std;

void travel(int n, vector<vector<int>>& M, vector<vector<bitset<32>>>& D, vector<vector<bitset<32>>>& P, unsigned& minlength)
{
    int i, k, j;
    int vecNum = pow(2, n);
    vector<bitset<32>> V;
    bitset<32> U(0);

    for (i = 1; i < n; i++) 
    {
        D[i][0] = M[i][0];
    } //starter TSP translated

    for (k = 1; k <= n - 1; k++) 
    {
        for (i = 1; i < vecNum; i++) //containing k vertices
        {
            bitset<32> tempBS(i);
            if (tempBS.count() == k && !tempBS.test(0)) //for i such the i != 1 and v_i not in A
            {
                V.push_back(tempBS); //insert bs into vector
            }
        }

        for (auto itr = V.begin(); itr != V.end() - 1; itr++) //vector of bs itr
        {
            bitset<32> A = *itr;

            //insert into A and test other functions
            //use temp variables and add the bitsets into corresponding places
        }
    }
}

int main()
{
    fstream infile;
	string inFileName;

    vector<pair<int, string>> city = vector<pair<int, string>>();
    vector<vector<int>>matrix = vector<vector<int>>();
    int n{ 0 }, vID{ 0 }; //num, vertex ID

	cout << "Enter text file (with ext): " << endl;
    cin >> inFileName;

    infile.open(inFileName, fstream::in);
    if (infile.fail())
    {
        cerr << "Problem opening " << inFileName << " file.";
        exit(1);
    }

    vector<vector<int>>D = vector<vector<int>>(n);
    vector<vector<int>>P = vector<vector<int>>(n);
    vector<vector<int>>W = vector<vector<int>>(n);

    cout << inFileName << " Contents:\n" << endl;

    while (!infile.eof()) 
    {
        string city;
        infile >> vID;
        infile.ignore();
        getline(infile, city, ' '); //vID

        for (int i = 0; i < n; i++) //itr through points
        {
            int id, codomain;
            vector<int>tmp;

            infile >> id;
            cout << id << " ";
            infile >> codomain;
            cout << codomain << " ";

            for (int j = 0; j < n; j++) 
            {
                tmp.push_back(0);
            }

            matrix.push_back(tmp); 
        }
        cout << endl;
    }

    unsigned int x;
    //int optimalCost = travel(city.size(), D, P, x);

	cout << "*********Output according to " << inFileName << " contents:\n" << endl;
	//cout << "Optimal Tour Cost = " << optimalCost << endl;

    infile.close();

	return 0;
}
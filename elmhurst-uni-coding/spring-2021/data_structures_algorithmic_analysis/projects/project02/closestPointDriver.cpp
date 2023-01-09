#include "Point.h"
#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <tuple>
#include <algorithm>
#include <math.h>
using namespace std;

pair<Point, Point> closest(vector<Point> p);

int main()
{

	ifstream infile;
	vector<Point> points;

	string fileName;
	//prompt for enter file name
	cout << "Enter file name: ";
	cin >> fileName;

	infile.open(fileName);
	if (infile.fail())
	{
		//report and exit
		cout << "File failed to open." << endl;
		infile.close();
	}

	double x, y;
	while (infile >> ws && !infile.eof())
	{
		infile >> x >> y;
		points.push_back(Point(x, y));
	}
	infile.close();

	double n = points.size();
	pair<Point, Point> closestPair = closest(points);
	//cout << "Closest points are: (" << std::get<0>(closestPair) << ") and (" <<
		//std::get<1>(closestPair) << ") with distance = " << std::get<2>(closestPair);
}

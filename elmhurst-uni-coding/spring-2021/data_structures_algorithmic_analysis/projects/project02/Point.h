#ifndef __POINT__
#define __POINT__
#include <iostream>
#include <fstream>
#include <math.h>
using namespace std;
class Point
{
public:
	Point()
	{
		this->x = 0.0;
		this->y = 0.0;
	}
	Point(double x, double y) {
		this->x = x;
		this->y = y;
	}
	Point(double x)
	{
		this->x = x;
		this->y = 0;
	}
	Point(const Point& p)
	{
		this->x = p.x;
		this->y = p.y;
	}
	const Point& operator=(const Point& rhs)
	{
		if (this != &rhs) {
			x = rhs.x;
			y = rhs.y;
		}
		return *this;
	}
	bool operator==(const Point p) const
	{
		return (this->x == p.x && this->y == p.y);
	}
	bool operator!=(const Point p) const
	{
		return (this->x != p.x || this->y != p.y);
	}
	double distance(Point p) const
	{
		return sqrt((this->x - p.getX()) * (this->x - p.getX()) + (this->y - p.getY()) * (this->y - p.getY()));
	}
	double minimum(double x, double y)
	{
		return (x < y) ? x : y;
	}
	double getX() const {
		return this->x;
	}
	double getY() const {
		return this->y;
	}
	void setX(double x)
	{
		this->x = x;
	}
	void setY(double y)
	{
		this->y = y;
	}
	class CompareXCoordinate {
	public:
		bool operator()(const Point& p1, const Point& p2) const
		{
			return (p1.getX() < p2.getX());
		}
	};
	class CompareYCoordinate {
	public:
		bool operator()(const Point& p1, const Point& p2) const
		{
			return (p1.getY() < p2.getY());
		}
	};
private:
	double x;
	double y;
};

//brute force returns distance bw two points O(n^2)
pair<Point,Point> bruteForce(vector<Point> p, int n)
{
	double min = 999999;
	pair<Point, Point> tuplePair(p.at(0), p.at(1));
	for (int i = 0; i < n; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if(p.at(i).distance(p.at(j)) < min)
				{
					min = p.at(i).distance(p.at(j));
					tuplePair.first = p.at(i);
					tuplePair.second = p.at(j);
				}
		}
	}
	return tuplePair;
}

//mergesort with point and cmp param
template <typename T>
void mergesort(vector<Point>& x, T compare)
{
	vector<Point> tmpVec(x.size());

	mergesort(x, tmpVec, 0, x.size() - 1, compare);
}

//mergesort with point, tmpvec, left/right, cmp param
template <typename T>
void mergesort(vector<Point>& x, vector<Point>& tmpVec, int left, int right, T compare)
{
	if (left < right)
	{
		int center = (left + right) / 2;
		mergesort(x, tmpVec, left, center, compare);
		mergesort(x, tmpVec, center + 1, right, compare);
		merge(x, tmpVec, left, center + 1, right, compare);
	}
}

//merge both halves
template <typename T>
void merge(vector<Point>& x, vector<Point>& tmpVec, int leftPos, int rightPos, int rightEnd, T compare)
{
	int leftEnd = rightPos - 1;
	int tmpPos = leftPos;
	int numElements = rightEnd - leftPos + 1;

	//main loop
	while (leftPos <= leftEnd && rightPos <= rightEnd)
		if (compare(x.at(leftPos), x.at(rightPos)))
			tmpVec.at(tmpPos++) = std::move(x.at(leftPos++));
		else
			tmpVec.at(tmpPos++) = std::move(x.at(rightPos++));
	
	//copy rest of first half
	while (leftPos <= leftEnd)
		tmpVec.at(tmpPos++) = std::move(x.at(leftPos++));

	//copy rest of second hald
	while (rightPos <= rightEnd)
		tmpVec.at(tmpPos++) = std::move(x.at(leftPos++));

	//move tmpVec
	for (int i = 0; i < numElements; ++i, --rightEnd)
		x.at(rightEnd) = std::move(tmpVec.at(rightEnd));
}

//smallest distance in strip O(n) of both the left, right, and strip
pair<Point,Point> closestAcrossStrip(vector<Point> strip, unsigned size, double d, vector<Point>& points)
{
	pair<Point, Point> tuplePair(points.at(0), points.at(1));
	double min = d;
	Point::CompareYCoordinate YCoord;
	mergesort(strip, YCoord);
	for (unsigned i = 0; i < size; ++i)
	{
		for (unsigned j = i + 1; j < size && (strip[j].getY() - strip[i].getY()) < min; ++j)
		{
			if (strip[i].distance(strip[j]) < min)
			{
				points.clear();
				points.push_back(strip[i]);
				points.push_back(strip[j]);
				min = strip[i].distance(strip[j]);
			}
		}
	}
	return tuplePair;
}

//return a pair of points with shortest distance
pair<Point,Point> closest(vector<Point> p)
{
	pair<Point, Point> tuplePair(p.at(0), p.at(1));
	int center = p.size() / 2;

	vector<Point> left = vector<Point>(p.begin(), p.begin() + center);
	vector<Point> right = vector<Point>(p.begin()+center, p.end());

	pair<Point, Point> point1 = pair<Point, Point>();
	pair<Point, Point> point2 = pair<Point, Point>();

	if (left.size() <= 4)
	{
		point1 = bruteForce(left, left.size());
	}
	else
	{
		point1 = closest(left);
	}
	if (right.size() <= 4)
	{
		point2 = closest(right);
	}
	else
	{
		point2 = closest(right);
	}

	double dist1 = point1.first.distance(point1.second);
	double dist2 = point2.first.distance(point2.second);
	double minDist = min(dist1, dist2);

	if (minDist == dist1)
	{
		tuplePair = point1;
	}
	else
	{
		tuplePair = point2;
	}

	vector<Point> strip = vector<Point>();
	for (Point x : p)
	{
		if (abs(p.getX() - p.at(center).getX()) < minDist)
		{
			strip.push_back(p);
		}
	}

	if (strip.size() > 1)
	{
		pair<Point, Point> pair = closestAcrossStrip(strip, strip.size(), minDist);
		if (pair.first.distance(pair.second) < minDist)
		{
			return pair;
		}
	}

	return tuplePair;
}

ifstream& operator>>(ifstream& in, Point& p) {
	double x;
	double y;
	in >> x;
	in >> y;
	p.setX(x);
	p.setY(y);
	return in;
}
ostream& operator<<(ostream& outfile, const Point& p)
{
	outfile << p.getX() << ' ' << p.getY();
	return outfile;
}
#endif
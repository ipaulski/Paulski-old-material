#pragma once
#include <iostream>
#include <vector>

using namespace std;

class PuzzleState
{
public:
	PuzzleState() {
		rows = 0;
		cols = 0;
	}  // default constructor

	PuzzleState(int n, int m)  
	{
		tiles.resize(n * m); rows = n; cols = m;
	}//constructor
	~PuzzleState() {
		cols = 0;
		rows = 0;
		blank_position_row = 0;
		blank_position_col = 0;
		tiles.clear();
		tiles.~vector();
	}//destructor
	PuzzleState(const PuzzleState& rhs)   
		: rows(rhs.rows), cols(rhs.cols),
		tiles(rhs.tiles),
		blank_position_row(rhs.blank_position_row),
		blank_position_col(rhs.blank_position_col)
	{ }// copy constructor

	bool operator==(const PuzzleState& rhs) const 
	{
		if (this->rows == rhs.rows && this->cols == rhs.cols) 
		{
			if (this->tiles == rhs.tiles) return true;
			else return false;
		}
		else return false;
	}
	bool operator!=(const PuzzleState& rhs) const 
	{
		return !(*this == rhs);
	}
	const PuzzleState& operator=(const PuzzleState& rhs) 
	{
		rows = rhs.rows;
		cols = rhs.cols;
		tiles = rhs.tiles;
		blank_position_row = rhs.blank_position_row;
		blank_position_col = rhs.blank_position_col;
		return *this;
	}
	bool isNullState() { return rows == 0; }

	bool canMoveUp() 
	{
		return (blank_position_row != 1) ? true : false;
	}
	bool canMoveDown() 
	{
		return (blank_position_row != rows) ? true : false;
	}
	bool canMoveLeft() 
	{
		return (blank_position_col != 1) ? true : false;
	}
	bool canMoveRight() 
	{
		return (blank_position_col != cols) ? true : false;
	}
	PuzzleState moveBlankUp() 
	{
		int newRow = blank_position_row - 1;
		int newCol = blank_position_col;

		int i = (newRow * (tiles.size() / rows) - (cols - newCol) - 1); //new position
		int bI = ((blank_position_row) * (tiles.size() / rows) - (cols - (blank_position_col)) - 1); //previous position

		int temp = tiles[i];
		tiles[i] = 0;
		tiles[bI] = temp;  //swap positions

		blank_position_row -= 1;
		return *this;
	}
	PuzzleState moveBlankDown() 
	{
		int newRow = blank_position_row + 1;
		int newCol = blank_position_col;

		int i = (newRow * (tiles.size() / rows) - (cols - newCol) - 1); //new position
		int bI = ((blank_position_row) * (tiles.size() / rows) - (cols - (blank_position_col)) - 1);  //previous position

		int temp = tiles[i];
		tiles[i] = 0;
		tiles[bI] = temp;  //swap positions

		blank_position_row += 1;
		return *this;
	}

	PuzzleState moveBlankLeft() 
	{
		int newRow = blank_position_row;
		int newCol = blank_position_col - 1;

		int i = (newRow * (tiles.size() / rows) - (cols - newCol) - 1); //new position
		int bI = ((blank_position_row) * (tiles.size() / rows) - (cols - (blank_position_col)) - 1); //previous position

		int temp = tiles[i];
		tiles[i] = 0;
		tiles[bI] = temp;  //swap positions

		blank_position_col -= 1;
		return *this;
	}
	PuzzleState moveBlankRight() 
	{
		int newRow = blank_position_row;
		int newCol = blank_position_col + 1;

		int i = (newRow * (tiles.size() / rows) - (cols - newCol) - 1); //new position
		int bI = ((blank_position_row) * (tiles.size() / rows) - (cols - (blank_position_col)) - 1);  //previous position

		int temp = tiles[i]; 
		tiles[i] = 0;
		tiles[bI] = temp; //swap positions

		blank_position_col += 1;
		return *this;
	}

	void read(istream& in) 
	{
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				int input;
				in >> input;
				in.ignore();
				tiles[i * cols + j] = input;

				if (tiles[i * cols + j] == 0) 
				{
					blank_position_row = i + 1;
					blank_position_col = j + 1;
				}
			}
		}
	}
	void print(ostream& out) 
	{

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				cout << tiles[rows * i + j];
			}
			cout << "\n";
		}
	}
	static PuzzleState  NullState(PuzzleState& x) 
	{
		PuzzleState y(0, 0);
		x = y;
		return x;
	}
private:
	int rows;
	int cols;
	vector<int> tiles;
	int blank_position_row;
	int blank_position_col;
};
void Swap(int& x, int& y) 
{
	int temp = x;
	x = y;
	y = temp;
}
istream& operator>>(istream& in, PuzzleState& rhs) 
{
	rhs.read(in);
	return in;
}
ostream& operator<<(ostream& out, PuzzleState& rhs) 
{
	rhs.print(out);
	return out;
}
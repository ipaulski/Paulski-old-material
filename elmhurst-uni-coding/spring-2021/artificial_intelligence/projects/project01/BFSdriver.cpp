#include "PuzzleState.h"
#include "PuzzleMove.h"
#include <iostream>
#include <vector>
#include <list>
#include <iterator>
using namespace std;

list<PuzzleMove>::const_iterator& findNextParent(PuzzleState& state, list<PuzzleMove>::const_iterator& from, list<PuzzleMove>& moveList) 
{
	PuzzleMove startMove;
	list<PuzzleMove>::const_iterator& itr = from;

	for (itr = from; itr != moveList.end(); itr++) 
	{
		startMove = *itr;
		if (state == startMove.getState())
			break;
	} //iterates through list and finds next parent
	return itr;
}

void printSolution(list<PuzzleMove>& solution) 
{
	PuzzleMove move;
	PuzzleState curState;
	PuzzleState parentState;
	MoveType moveT;

	vector<string> moveName(4);
	moveName[0] = "down";
	moveName[1] = "left";
	moveName[2] = "right";
	moveName[3] = "up";

	for (list<PuzzleMove>::const_iterator itr = solution.begin(); itr != solution.end(); itr++) 
	{
		move = *itr;  
		curState = move.getState();
		parentState = move.getParent();
		moveT = move.getMoveName();
		cout << parentState << "\n" << moveName[moveT] << "\n\n";

	}//iterates through list and prints out info
	cout << curState << "\nMoves = " << moveName.size() + 1;
}

bool findSolution(PuzzleState start, PuzzleState goal, list<PuzzleMove>& solution) 
{
	list<PuzzleMove>::const_iterator last_found_position;
	list<PuzzleMove> open;
	list<PuzzleMove> closed;
	static int count = 0;
	PuzzleState curState = start;
	PuzzleState parentState;
	PuzzleState  childState;
	PuzzleState thisNull;
	thisNull.NullState(thisNull);
	
	PuzzleMove curMove(start, thisNull, nullMove);
	open.push_back(curMove); 

	while (!open.empty()) 
	{
		curMove = open.front();
		open.pop_front();
		closed.push_front(curMove);
		curState = curMove.getState();

		if (curState == goal) 
		{
			cout << "****Solution Found****\nNodes Expanded = " << count << "\n\n";

			last_found_position = closed.begin();
			parentState = curMove.getParent();

			//create a solution list that contains all of the moves it took to get to the optimal solution
			while (parentState != PuzzleState::NullState(thisNull)) 
			{
				solution.push_front(curMove);
				curState = parentState;
				last_found_position = findNextParent(curState, last_found_position, closed);
				curMove = *last_found_position;
				parentState = curMove.getParent();
			}
			return true;
		}

		if (curState.canMoveDown()) //for BFS start down then left, up, right and set flags for checks
		{
			MoveType down{};
			childState = curState;
			childState.moveBlankDown();
			bool f1 = 1;
			bool f2 = 1;//set flags to find state within list

			for (auto j : open) 
			{
				if (childState == j.getState()) 
				{
					f2 = 0;
				}//change flag if found in list
			}
			for (auto i : closed) 
			{
				if (childState == i.getState()) 
				{
					f1 = 0;
				}//change flag if found in list
			}

			if (f1 == 1 && f2 == 1) 
			{
				PuzzleMove moveDown(childState, curState, MoveType::down);
				open.push_back(moveDown);
			}//pushes new state if neither flag changes
		}
		if (curState.canMoveLeft()) 
		{
			MoveType left{};
			childState = curState;
			childState.moveBlankLeft();
			bool f1 = 1;
			bool f2 = 1;//set flags to find state within list

			for (auto j : open) 
			{
				if (childState == j.getState()) 
				{
					f2 = 0;
				}//change flag if found in list
			}
			for (auto i : closed) 
			{
				if (childState == i.getState()) 
				{
					f1 = 0;
				}//change flag if found in list
			}

			if (f1 == 1 && f2 == 1) 
			{
				PuzzleMove moveLeft(childState, curState, MoveType::left);
				open.push_back(moveLeft);
			}//pushes new state if neither flag changes
		}
		if (curState.canMoveUp()) 
		{
			MoveType up{};
			childState = curState;
			childState.moveBlankUp();
			bool f1 = 1;
			bool f2 = 1;//set flags to find state within list

			for (auto j : open) 
			{
				if (childState == j.getState()) 
				{
					f2 = 0;
				}//change flag if found in list
			}
			for (auto i : closed) 
			{
				if (childState == i.getState()) 
				{
					f1 = 0;
				}//change flag if found in list
			}

			if (f1 == 1 && f2 == 1) 
			{
				PuzzleMove moveUp(childState, curState, MoveType::up);
				open.push_back(moveUp);
			}//pushes new state if neither flag changes
		}
		if (curState.canMoveRight()) 
		{
			MoveType right{};
			childState = curState;
			childState.moveBlankRight();
			bool f1 = 1;
			bool f2 = 1;//set flags to find state within list

			for (auto j : open) 
			{
				if (childState == j.getState()) 
				{
					f2 = 0;
				}//change flag if found in list
			}
			for (auto i : closed) 
			{
				if (childState == i.getState()) 
				{
					f1 = 0;
				}//change flag if found in list
			}

			if (f1 == 1 && f2 == 1) 
			{
				PuzzleMove moveRight(childState, curState, MoveType::right);
				open.push_back(moveRight);
			}//pushes new state if neither flag changes
		}
		count++;
	}
	return true;
}

int main() 
{
	int n;
	cout << "Enter number of rows and columns: ";
	cin >> n;
	cout << " \n";

	PuzzleState startState(n, n);
	PuzzleState goalState(n, n);
	cout << "Enter Start State row by row: ";
	cin >> startState;
	cout << startState << "\n";


	cout << "Enter Goal State row by row: ";
	cin >> goalState;
	cout << goalState << "\n";

	list <PuzzleMove> sol;

	if (startState == goalState) {
		cout << "Start state is equal to goal state.";
	}
	else if (findSolution(startState, goalState, sol)) {
		printSolution(sol);
	}
	return 0;
}
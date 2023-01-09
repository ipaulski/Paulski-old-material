#include "PuzzleState.h"
#include "PuzzleMove.h"
#include <iostream>
#include <vector>
#include <queue>
#include <list>
#include <iterator>
using namespace std;

class itrQueue
{
public:
	bool operator()(PuzzleMove& x, PuzzleMove& y)
	{
		return (x.getF() > y.getF());
	}
};//itr through both puzzlemoves and compare 

int f(PuzzleState goal, PuzzleState cur)
{
	int h = cur.hFunc(goal);
	int g = cur.getG();
	return h + g;
}//f heuristic

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
}

bool findSolution(PuzzleState start, PuzzleState goal, list<PuzzleMove>& solution)
{
	list<PuzzleMove>::const_iterator last_found_position;
	priority_queue<PuzzleMove, vector<PuzzleMove>, itrQueue> open; //open becomes priority queue
	list<PuzzleMove> compareMove;
	list<PuzzleMove> closed;
	PuzzleState curState = start;
	PuzzleState parentState;
	PuzzleState childState;
	PuzzleState thisNull;
	PuzzleState printState;
	thisNull.NullState(thisNull);

	PuzzleMove curMove(start, thisNull, nullMove, f(goal, start));
	open.push(curMove);

	while (!open.empty())
	{
		curMove = open.top();
		open.pop();
		closed.push_front(curMove);
		curState = curMove.getState();

		if (curState == goal)
		{
			cout << "\nSolution: \n\n";

			last_found_position = closed.begin();
			parentState = curMove.getParent();

			while (parentState != PuzzleState::NullState(thisNull)) //solution
			{
				cout << printState;
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
			childState.setG(curState);
			bool f1 = 1;//set flags to find state within list

			for (auto i : compareMove)
			{
				if (childState == i.getState())
				{
					f1 = 0;
				}//change flag if found in list
			}

			if (f1 == 1)
			{
				printState == childState;
				PuzzleMove moveDown(childState, curState, MoveType::down, f(goal, childState));
				open.push(moveDown);
				compareMove.push_back(moveDown);
			}//pushes new state if neither flag changes
		}
		if (curState.canMoveLeft())
		{
			MoveType left{};
			childState = curState;
			childState.moveBlankLeft();
			childState.setG(curState);
			bool f1 = 1;//set flags to find state within list

			for (auto i : compareMove)
			{
				if (childState == i.getState())
				{
					f1 = 0;
				}//change flag if found in list
			}

			if (f1 == 1)
			{
				PuzzleMove moveLeft(childState, curState, MoveType::left, f(goal, childState));
				open.push(moveLeft);
				compareMove.push_back(moveLeft);
			}//pushes new state if neither flag changes
		}
		if (curState.canMoveUp())
		{
			MoveType up{};
			childState = curState;
			childState.moveBlankUp();
			childState.setG(curState);
			bool f1 = 1;//set flags to find state within list

			for (auto i : compareMove)
			{
				if (childState == i.getState())
				{
					f1 = 0;
				}//change flag if found in list
			}

			if (f1 == 1)
			{
				PuzzleMove moveUp(childState, curState, MoveType::up, f(goal, childState));
				open.push(moveUp);
				compareMove.push_back(moveUp);
			}//pushes new state if neither flag changes
		}
		if (curState.canMoveRight())
		{
			MoveType right{};
			childState = curState;
			childState.moveBlankRight();
			childState.setG(curState);
			bool f1 = 1;//set flag to find state within list

			for (auto i : compareMove)
			{
				if (childState == i.getState())
				{
					f1 = 0;
				}//change flag if found in list
			}
			if (f1 == 1)
			{
				PuzzleMove moveRight(childState, curState, MoveType::right, f(goal, childState));
				open.push(moveRight);
				compareMove.push_back(moveRight);
			}//pushes new state if neither flag changes
		}
	}
	return true;
}

int main()
{
	int n;
	cout << "Enter number of rows and columns: ";
	cin >> n;

	PuzzleState startState(n, n);
	PuzzleState goalState(n, n);
	cout << "Enter Start State row by row: \n";
	cin >> startState;
	/*cout << startState << "\n"; */ //test if inputted correctly


	cout << "Enter Goal State row by row: \n";
	cin >> goalState;
	/*cout << goalState << "\n"; */ //test if inputted correctly

	list <PuzzleMove> sol;

	if (startState == goalState) {
		cout << "Start state is equal to goal state.";
	}
	else if (findSolution(startState, goalState, sol)) {
		printSolution(sol);
	}
	return 0;
}
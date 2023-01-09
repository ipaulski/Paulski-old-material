#ifndef _PUZZLEMOVE_
#define _PUZZLEMOVE_

#include "PuzzleState.h"
using namespace std;
enum MoveType { down, left, right, up, nullMove };
class PuzzleMove
{
public:
	PuzzleMove() { }
	PuzzleMove(PuzzleState s, PuzzleState p, MoveType m, int f) : state(s), parent(p), move(m), f(f)
	{ }
	PuzzleState& getState()
	{
		return state;
	}
	PuzzleState& getParent()
	{
		return parent;
	}
	MoveType getMoveName()
	{
		return move;
	}
	int getF()
	{
		return f;
	}//get f heuristic
private:
	PuzzleState state;
	PuzzleState parent;
	MoveType move;
	int f; //added f heuristic
};
#endif
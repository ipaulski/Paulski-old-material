//Izabella Paulski
//CS418 P02 .py to .cpp
#include <random>
#include <string>
#include <vector>
#include <iostream>
#include <sstream>
#include <time.h>

using namespace std;

vector<char> generateRandomSolution(int len);
int evaluateSolution(vector<char> target, vector<char> sol);
void mutateSolution(vector<char>& sol);
void print(vector<char>& v);

int main()
{
	vector<char> newSol;
	string line;
	int num = 0;

	cout << "Enter Target String: ";
	getline(cin, line);
	istringstream iss(line);
	vector<char> target(line.begin(), line.end()); //fill vector with input

	//display vector elements
	cout << "Target String: ";
	print(target);
	
//        best = generate_random_solution()
//        best = list(best)
//        best_score = evaluate_solution(best)
//        evaluated = 0
//        accepted = 0
	srand(time(0));
	vector<char> best = generateRandomSolution(target.size());
	int bestScore = evaluateSolution(target, best);
	int evaluated = 0;
	int accepted = 0;
	int tracker = 0; //used to make sure no infinite looping

//  while True:
//    if best_score == 0 :
//    print('Number of solutions considered', evaluated)
//    print('Number of solutions accepted', accepted)
//    break
//    new_solution = list(best)
//    mutate_solution(new_solution)
	while (true)
	{
		if (bestScore == 0)
		{
			cout << "Best score: " << bestScore << "   Solution: ";
			print(best);
			cout << "\n\nNumber of solutions considered: " << evaluated << endl;
			cout << "Number of solutions accepted: " << accepted << endl;
			break;
		}
		newSol = best;
		mutateSolution(newSol);

		//    score = evaluate_solution(new_solution)
		//    evaluated += 1
		int score = evaluateSolution(target, newSol);
		evaluated += 1;
		num += 1;

		//    if score < best_score:
		//best = new_solution
		//best_score = score
		//print('Score:', best_score, '   Solution:', "".join(best))
		//accepted += 1
		if (score < bestScore)
		{
			//vector<char> best(newSol.begin(), newSol.end());
			best = newSol;
			bestScore = score;
			accepted += 1;
		}
		
		//print every 500 count
		if (num == 500 && bestScore != tracker)
		{
			cout << "Best score: " << bestScore << "   Solution: ";
			print(best);
			num = 0;
			tracker = bestScore;
		}
	}
	return 0;
}

//def generate_random_solution(length = 29) :
//    return (random.choice(string.printable) for _ in range(length))
const int len = 29;
vector<char> generateRandomSolution(int len)
{
	vector<char> randSol;
	char c;
	int ran = 0;
	for (int i = 0; i < len; i++)
	{
		ran = rand() % 95;
		c = ' ' + ran;
		randSol.push_back(c);
	}
	return randSol;
}

//    def evaluate_solution(solution) :
//    target = list("Follow the Yellow Brick Road!")
//    diff = 0
//    for i in range(len(target)) :
//        s = solution[i]
//        t = target[i]
//        diff += abs(ord(s) - ord(t))
//        return diff
int evaluateSolution(vector<char> target, vector<char> sol)
{
	int diff = 0;
	for (int i = 0; i < target.size(); i++)
	{
		int s = sol.at(i);
		int t = target.at(i);
		diff += abs(s - t);
	}
	return diff;
}

//    def mutate_solution(solution) :
//        index = random.randint(0, len(solution) - 1)
//        solution[index] = random.choice(string.printable)
void mutateSolution(vector<char>& sol)
{
	int index = rand() % (sol.size());
	int i = rand() % 95;
	sol[index] = ' ' + i;
}

void print(vector<char>& v)
{
	for (auto x : v)
		cout << x;
	cout << endl;
}

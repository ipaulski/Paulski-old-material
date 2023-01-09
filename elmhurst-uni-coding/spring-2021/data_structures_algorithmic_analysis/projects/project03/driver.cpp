//Izabella Paulski
//this is late because i did not realize i had to check output in the actual text file
//i kept checking the console.......................

#include <iostream>
#include <fstream>
#include "BinarySearchTree.h"
#include "MyMap.h"
#include "ScannerForIdents.h"
#include "exceptions_CS320.h"
#include "OrderedPair.h"
#include <set>
#include <vector>
#include <algorithm>

using namespace std;

bool isReserved(string lexeme)
{
	static const unsigned NUM_RESERVED = 73;
	static string reservedWords[NUM_RESERVED] = {"and", "and_eq", "asm", "auto", "bitand", "bitor", "bool", "break", "case", "catch", "char", "class", "compl", "const", "const_cast", "continue", "default", "delete", "do", "double",
		"dynmaic_cast", "else", "enum", "explicit", "extern", "false", "float", "for", "friend", "goto", "if", "inline", "int", "long", "mutable", "namespace", "new", "not", "not_eq", "operator", "or", "or_eq", "private",
		"protected", "public", "register", "reinterpret-cast", "return", "short", "signed", "sizeof", "static", "static_cast", "struct", "switch", "template", "this", "throw", "true", "try",
		"typedef", "typeid", "typename", "union", "unsigned", "using", "virtual", "void", "volatile", "wchar_t", "while", "xor", "xor_eq"};
	
	//BinarySearch, true if found
	vector<string> BST_vector(reservedWords, reservedWords + NUM_RESERVED);
	return binary_search(BST_vector.begin(), BST_vector.end(), lexeme);
}

void printXRefTable(MyMap<string, set<unsigned>>& table, fstream& out)//traverse in order, using iterators start @ beg
{
	//itr across myreference, beginning is first ident in lex order
	for (auto i = table.begin(); i != table.end(); i++) 
	{
		out << (*i).first << "		";
		for (auto j = (*i).second.begin(); j != (*i).second.end(); j++) 
		{
			out << (*j) << "		";
		}
		out << "\n";
	}
}

unsigned main()
{
	//testing functions for BST
	/*
	unsigned errors = 0;
	BinarySearchTree<unsigned> t0;
	BinarySearchTree<unsigned> t2;
	unsigned a[] = { 20, 15, 1, 5, 30, 35, 32, 16, 18, 12, 3 };
	BinarySearchTree<unsigned> t1(a, a + 11);
	const unsigned int twelve = 12;
	const unsigned int thirteen = 13;
	BinarySearchTree<unsigned>::iterator t1Find12;
	BinarySearchTree<unsigned>::iterator t1Find13;

	t2.insert(30);
	t2.insert(15);
	
	cout << "Printing t1 BST: ";
	for (BinarySearchTree<unsigned>::iterator itr = t1.begin(); itr != t1.end(); itr++)
	{
		cout << *itr << " ";
	}
	cout << endl;

	cout << "Size of t1: " << t1.size()<< endl;
	cout << "Max of t1: " << t1.findMax() << endl;
	cout << "Min of t1: " << t1.findMin() << endl;
	cout << "Erase '32': [1 if true, 0 if false]: " << t1.erase(32) << endl;
	t1.printInOrder();
	cout << "\nIs t1 empty?: " << boolalpha << t1.empty() << "\nIs t0 empty?: " << boolalpha << t0.empty() << endl;
	cout << "Find '12': " << boolalpha;
	t1Find12 = t1.find(twelve);
	cout << " , and find '13': " << boolalpha;
	t1Find13 = t1.find(thirteen);
	t1.makeEmpty();
	cout << "Is t1 empty after makeEmpty(): " << boolalpha << t1.empty() << endl;
	*/

	//testing in/out file 
	fstream infile;
	fstream outfile;
	string inFileName;
	string outFileName;
	MyMap<string, set<unsigned>> xRefTable;
	unsigned currentLineNumber;

	cout << "\nPlease enter file name to read (full name including extension): " << endl;
	cin >> inFileName;
	infile.open(inFileName, fstream::in);
	if (infile.fail())
	{
		cerr << "Problem opening " << inFileName << " file.";
		exit(1);
	}

	cout << "Please enter file name for output of cross-reference (full name including extension): " << endl;
	cin >> outFileName;
	outfile.open(outFileName, fstream::out);
	if (outfile.fail())
	{
		cerr << "Problem opening " << outFileName << " file.";
		exit(2);
	}

	string lexeme;
	ScannerForIdents aScanner(infile);
	int nextToken;
	while ((nextToken = aScanner.getIdent()) == 1)
	{
		lexeme = aScanner.getLastLexeme();
		if (!isReserved(lexeme))
		{
			currentLineNumber = aScanner.getNumberOfLines();
			xRefTable[lexeme].insert(currentLineNumber);
		}
	}

	printXRefTable(xRefTable, outfile);
	infile.close();
	outfile.close();

	return 0;
}
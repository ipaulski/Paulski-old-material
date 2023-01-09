//Izabella Paulski
//CS 418 P04 Genetic Algorithm
//Solving N-Queens problem with Breakout02 as reference
//This was solved to the best of my interpretation; errors were in GAPhrase & I
//am unsure on how to resolve them.

// Modifications made to implementation by KLR

// The Nature of Code
// Daniel Shiffman
// http://natureofcode.com

// Genetic Algorithm, Evolving Shakespeare

// A class to describe a psuedo-DNA, i.e. genotype
//   Here, a virtual organism's DNA is an array of character.
//   Functionality:
//	      -- convert DNA into a string
//	      -- calculate DNA's "fitness"
//	      -- mate DNA with another set of DNA
//	      -- mutate DNA
//	      -- print DNA and fitness
//

import java.util.*;

public class DNA {

	// The genetic sequence
	private static String strCharacters = "123456789";
	private static char[] charArray = strCharacters.toCharArray();

	private char[][] genes;
	private char[] genesChar;
	private double fitness;

	// Constructor (makes a random DNA) of N-Queens Board

	DNA(int num) {
		genes = new char[num][num];

		Random r = new Random();
		for (int col = 0; col < genes.length; col++) {
			int insNum = charArray[r.nextInt(9)];
			if(insNum <= genes.length) {
				genesChar[col] = (char) insNum; //charArray of nums
				genes[insNum][col] = 'Q';
			}
			else
				genes[1][col] = 'Q';
		}
	}

	// Converts character array to a String
	//public String getPhrase() {
	//	return new String(genes);
	//}

	public double getFitness() {
		return fitness;
	}

	// Fitness function (returns floating point % of "correct" characters)
	public void calcFitness() {
		// calculate fitness based off how far one queen is from another via diagonals/rows
		int score = 0;
		int i,j;
		int NQueens = genes.length;
		for(int col = 0; col < genes.length; col++) {
			for(int row = 0; row < genes.length; row++){
				NQueens -= 1 + col; //setup for each queen must be n-col-1
				if(genes[row][col] == 'Q'){
					for (i = 0; i > col; i++) { //check right side of row
						if (genes[row][i] == 'Q')
							score += NQueens-1;
					}
					for (i = row, j = col; i >= 0 && j >= genes.length; i--, j++) { //check right upper diagonal
						if (genes[i][j] == 'Q')
							score += NQueens-1;
					}
					for (i = row, j = 0; j >= 0 && i < genes.length; i++, j++) { //check right lower diagonal
						if (genes[i][j] == 'Q')
							score += NQueens-1;
					}
				}
			}
		}

		fitness = (double) score / genes.length; //fitness is calc with mult populations; lets assume DNA + partner [hardcoded '2']
	}

	// Crossover -- many ways to do this
	public DNA crossover(DNA partner) {
		// A new child
		DNA child = new DNA(genesChar.length);
		int midpoint = (int) (Math.random() * (genesChar.length));

		for (int i = 0; i < genesChar.length; i++) {
			if (i > midpoint)
				child.genesChar[i] = genesChar[i];
			else
				child.genesChar[i] = partner.genesChar[i];
		}
		return child;
	}

	// Based on a mutation probability, picks a new random character
	public void mutate(double mutationRate) {
		Random r = new Random();

		for (int i = 0; i < genesChar.length; i++) {
			if (Math.random() < mutationRate) {
				int insNum = charArray[r.nextInt(9)];
				if(insNum <= genesChar.length)
					genesChar[i] = (char) insNum;
			}
		}
	}

	public String toString() {
		/*for (int row = 0; row < genes.length; row++) {
			for(int col = 0; col < genes.length; col++) {
				System.out.print(" " + genes[row][col] + " ");
			}
			System.out.println();
		}*/
		String geneStr = new String(String.valueOf(genes));
		String strFitness = String.format("%.2f", fitness);
		return (geneStr + " " + strFitness);
	}
}

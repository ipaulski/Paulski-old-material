//Izabella Paulski
//CS 418 P04 Genetic Algorithm

// Modifications made to implementation by KLR

// The Nature of Code
// Daniel Shiffman
// http://natureofcode.com

// Genetic Algorithm, Evolving Shakespeare

// Demonstration of using a genetic algorithm to perform a search

// setup()
//  # Step 1: The Population
//	    # Create an empty population (an array or ArrayList)
//	    # Fill it with DNA encoded objects (pick random values to start)

// draw()
//  # Step 1: Selection
//	    # Create an empty mating pool (an empty ArrayList)
//	    # For every member of the population, evaluate its fitness based on some criteria / function,
//	      and add it to the mating pool in a manner consistant with its fitness, i.e. the more fit it
//	      is the more times it appears in the mating pool, in order to be more likely picked for reproduction.

//  # Step 2: Reproduction Create a new empty population
//	    # Fill the new population by executing the following steps:
//	       1. Pick two "parent" objects from the mating pool.
//	       2. Crossover -- create a "child" object by mating these two parents.
//	       3. Mutation -- mutate the child's DNA based on a given probability.
//	       4. Add the child object to the new population.
//	    # Replace the old population with the new population
//
//   # Rinse and repeat

import java.util.*;

public class GAPhrase {

	public static void main(String[] args) {

		double mutationRate = 0.01; // Mutation rate
		int totalPopulation = 1000; // Total Population
		int generation = 0;

		DNA[] population = new DNA[totalPopulation]; // Array to hold the current population
		String target = "34158751"; // Target phrase for N-Queens; i dont think this is used

		setup(population, target);
		DNA best = population[0];

		for (int i = 0; i < 100; i++) {
			generation++;
			nextGen(population, target, mutationRate, generation);
		}
	}

	static void setup(DNA[] population, String target) {
		for (int i = 0; i < population.length; i++) {
			population[i] = new DNA(target.length());
		}
		displayPopulation(population, 0);
	}

	static void nextGen(DNA[] population, String target, double mutationRate, int generation) {

		// Calculate fitness
		for (int i = 0; i < population.length; i++) {
			population[i].calcFitness();
		}
		displayPopulation(population, generation);

		// Add candidates to matingPool
		ArrayList<DNA> matingPool = new ArrayList<DNA>();

		for (int i = 0; i < population.length; i++) {
			// Arbitrary multiplier, could make this smarter
			int n = (int) (population[i].getFitness() * 100);
			for (int j = 0; j < n; j++) {
				matingPool.add(population[i]);
			}
		}

		// Create the next generation
		for (int i = 0; i < population.length; i++) {
			int a = (int) (Math.random() * (matingPool.size()));
			int b = (int) (Math.random() * (matingPool.size()));
			DNA partnerA = matingPool.get(a);
			DNA partnerB = matingPool.get(b);
			DNA child = partnerA.crossover(partnerB);
			child.mutate(mutationRate);
			population[i] = child;
		}
	}

	static void displayPopulation(DNA[] population, int generation) {
		System.out.println("******  Generation:  " + generation + "  ******");
		for (int i = 0; i < population.length; i++) {
			System.out.println(population[i]);
		}
	}
}
package q5;

import java.util.ArrayList;

public class PrimeFactorizer 
{
	/**
	 * Initialize the object with target number n
	 * @param n target number
	 */
	public PrimeFactorizer(int n)
	{
		targetNumber = n;
		hasComputed = false;
		primeFactors = null;
		exponents = null;
	}
	
	/**
	 * Return n, the target number
	 * @return n
	 */
	public int getN()
	{
		return targetNumber;
	}
	
	/**
	 * Computes factorization. Will not repeat operation if it was called before
	 */
	public void compute() throws Exception
	{
		// if hasComputed has already been set to true, throw Exception
		if(hasComputed == true)
		{
			throw new Exception ("Compute() Function has already been called!");
		}
		
		// otherwise set hasComputed to true for the first time it runs
		hasComputed = true;
		int listPosition = 0;
		
		// Create new instances of ArrayList<Integer>
		ArrayList<Integer> listOfPrimes = generatePrimeNumbers(targetNumber);
		ArrayList<Integer> factorCount = new ArrayList<Integer>();
		
		// Populate factorCount list with zeros up to the same size as listOfPrimes arraylist
		for(int i = 0; i < listOfPrimes.size(); i++)
		{
			factorCount.add(0);
		}
		
		// Copy targetNumber instance into variable, this will not modify the instance variable copy
		int cloneTargetNumber = targetNumber;
		
		// while the cloneTargetNumber doesn't equal 1, start with 1st prime number in listOfPrimes arraylist
		// then check to see if there is a reminder for cloneTargetNumber and the prime number being used from
		// the listOfPrimes, if there is no remainder, then divide, maintain same index in listOfPrimes and add count to 
		// factorCount array. If unsuccessful go to next prime number in listOfPrimes arraylist and try again.
		// Once everything is completed, then at the end of the function, it will go and remove elements from both
		// listOfPrimes and factorCount based on the number of times a prime number was used. If it was not used, the 
		// prime number and corresponding factorCount is removed from the arrayLists. Then you are left with just
		// the prime factors and the number of times they were used.
		while(cloneTargetNumber != 1)
		{
			if(cloneTargetNumber % listOfPrimes.get(listPosition) == 0)
			{
				cloneTargetNumber /= listOfPrimes.get(listPosition);
				int count = factorCount.get(listPosition);
				count += 1;
				factorCount.remove(listPosition);
				factorCount.add(listPosition, count);
			}
			else
			{
				listPosition++;
			}
		}
		
		for(int i = 0; i < factorCount.size(); i++)
		{
			if(factorCount.get(i) == 0)
			{
				factorCount.remove(i);
				listOfPrimes.remove(i);
				i--;
			}
		}
		
		primeFactors = new ArrayList<Integer>(listOfPrimes);
		exponents = new ArrayList<Integer>(factorCount);
	}
	
	/**
	 * 
	 * @param n number to compute factorization
	 * @param primes list of primes to be retrieved from function
	 * @param exponents list of exponents to be retrieved from function
	 */
	public void getFactorsAndExponents(int n, ArrayList<Integer> primes, ArrayList<Integer> exponents)
	{
		try
		{
			if(this.targetNumber != n)
			{
				targetNumber = n;
				hasComputed = false;
				compute();
			}
		
			for(Integer elements : this.primeFactors)
			{
				primes.add(elements);
			}
		
			for(Integer elements: this.exponents)
			{
				exponents.add(elements);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Generates prime numbers to a specified range
	 * @param n range to generate primes to
	 * @return list of prime numbers up to n
	 */
	private ArrayList<Integer> generatePrimeNumbers(int n)
	{
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		
		for(int range = 2; range <= n; range++)
		{
			primeNumbers.add(range);
		}
		
		for(int i = 0; i < primeNumbers.size(); i++)
		{
			for(int j = 0; j < primeNumbers.size(); j++)
			{
				if(primeNumbers.get(j) % primeNumbers.get(i) == 0 && primeNumbers.get(j) != primeNumbers.get(i))
				{
					primeNumbers.remove(j);
				}
			}
		}
		
		return primeNumbers;
	}
	
	/**
	 * Returns a string representation of the prime factorization.
	 * Example: 60 = 2^2*3*5
	 */
	public String toString()
	{
		String prettyString = "";
		int primesInList = primeFactors.size();
		int exponentsInList = exponents.size();
		
		prettyString += this.targetNumber + " = ";
		
		for(int i = 0; i < primeFactors.size(); i++)
		{
			prettyString += primeFactors.get(i);
			if(exponents.get(i) == 1)
			{
				// do nothing
			}
			else
				prettyString += "^" + exponents.get(i);
			
			prettyString += "*";
		}
	
		prettyString = prettyString.substring(0, prettyString.length() - 1);
		return prettyString;
	}
	
	private int targetNumber;
	private ArrayList<Integer> primeFactors;
	private ArrayList<Integer> exponents;
	private boolean hasComputed;
	
}

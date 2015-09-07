package q3;

import java.util.LinkedList;

public class DataAnalyzer 
{
	/**
	 * Constructs an instance of the DataAnalyzer class
	 * @param numList a LinkedList object that contains Integer types
	 */
	DataAnalyzer(LinkedList<Integer> numList)
	{
		// instantiate data object of type LinkedList<Integer> with a copy
		// of the LinkedList from the argument numList
		data = new LinkedList<Integer>(numList);
	}
	
	/**
	 * @return minimum number found in the list
	 */
	public int min() throws Exception
	{
		// Variables to hold smallest number in Linkedlist
		// and to hold the current number being iterated
		// through in the linked list
		int smallestNumber = 0;
		int currentNumber = 0;
		
		// Checks to see the if the LinkedList is empty
		// if it is empty, it will throw an exception
		if(data.isEmpty() == true)
		{
			throw new Exception ("List is empty!");
		}
			
		// Grabs first element in the LinkedList and saves it into smallestNumber
		// This allows us to use the first number as the smallest encountered so far
		smallestNumber = data.getFirst();
			
		// For loop that iterates through the LinkedList checking for the smallest number
		for(int i = 0; i < data.size(); i++)
		{
			currentNumber = data.get(i);
			
			if(smallestNumber <= currentNumber)
			{
				// Do Nothing
			}
			else
				smallestNumber = currentNumber;
		}
			
		return smallestNumber;
	}
	
	/**
	 * @return average of all numbers in the list
	 */
	public int average() throws Exception
	{	
		// Variable to hold the average of all numbers in the LinkedList
		int average = 0;
		
		if(data.isEmpty() == true)
		{
			throw new Exception ("List is empty!");
		}
			
		// For Loop that adds up all the elements in the LinkedList
		for(int i = 0; i < data.size(); i++)
		{
			average += data.get(i);
		}
		
		return average/data.size();
	}

	
	/**
	 * @return maximum number in the list
	 */
	public int max() throws Exception
	{
		int currentNumber = 0;
		
		// Checks to see the if the LinkedList is empty
		// if it is empty, it will throw an exception
		if(data.isEmpty() == true)
		{
			throw new Exception ("List is empty!");
		}
			
		// Grabs first element in the LinkedList and saves it into biggestNumber
		// This allows us to use the first number as the largest encountered so far
		int biggestNumber = data.getFirst();
	
		// For loop that iterates through the LinkedList checking for the biggest number
		for(int i = 0; i < data.size(); i++)
		{
			currentNumber = data.get(i);
			
			if(biggestNumber >= currentNumber)
			{
				// Do Nothing
			}
			else
				biggestNumber = currentNumber;
		}
			
		return biggestNumber;
	}
	
	private LinkedList<Integer> data;
}

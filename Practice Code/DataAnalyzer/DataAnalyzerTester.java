package q3;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import q3.DataAnalyzer;

public class DataAnalyzerTester 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> numbers = null;
		PrintWriter outputStream = null;
		Scanner in = new Scanner(System.in);
		DataAnalyzer data = null;
		
		try
		{
			// Throw Exception is args length is 0
			if(args.length == 0)
			{
				throw new Exception ("Must enter at least one value!");
			}
			
			// Create a new LinkedList<Integer> to hold input from args
			numbers = new LinkedList<Integer>();
			
			// Loop through args and parse each Int, then save into numbers LinkedList
			for(int i = 0; i < args.length; i++)
			{
				numbers.add(Integer.parseInt(args[i]));
			}
			
			// Read in fileName from keyboard
			System.out.print("Please enter a file name to save input: ");
			String fileName = in.nextLine();
			
			// Create new file with file name specified in input
			outputStream = new PrintWriter(new FileOutputStream(fileName));
			System.out.print("Numbers Entered: ");
			outputStream.print("\nNumbers Entered: ");
			
			// Print numbers on screen and print to open file
			for(int i = 0; i < numbers.size(); i++)
			{
				System.out.print(numbers.get(i) + " ");
				outputStream.print(numbers.get(i));
			}
			
			// Create a new instance of a DataAnalyzer and insert numbers LinkedList object
			data = new DataAnalyzer(numbers);
			
			// Print Max, Average, and Min to file
			outputStream.println();
			outputStream.println("Max: " + data.max());
			outputStream.println("Average: " + data.average());
			outputStream.println("Min: " + data.min());
			
			// Print the same as above on screen
			System.out.println();
			System.out.println("Max: " + data.max());
			System.out.println("Average: " + data.average());
			System.out.println("Min: " + data.min());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage() + ", must be an integer!");
			System.exit(0);
		}
		catch(Exception error)
		{
			System.out.println(error.getMessage());
			System.exit(0);
		}
		finally
		{
			outputStream.close();
			in.close();
			System.exit(0);
		}
	}
}

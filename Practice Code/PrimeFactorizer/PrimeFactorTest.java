package q5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedList;

public class PrimeFactorTest 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> primeNumbersRetrieved = new ArrayList<Integer>();
		ArrayList<Integer> exponentsRetrieved = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		
		try
		{
			int n = Integer.parseInt(in.next());
			
			if(n < 2)
			{
				throw new Exception ("number must be greater than 2");
			}
			
			PrimeFactorizer test = new PrimeFactorizer(n);
			test.compute();
			System.out.println(test);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage() + " must be an integer!");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			in.close();
		}
	}
}

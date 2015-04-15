/*
The program takes a number and determines how many holes the number has.

The numbers 1 2 3 4 5 7 do not have hole(s).
 
While the numbers 0, 6, 8, 9 have hole(s). 


Examples: 
    		Input: 889
    		Output: The number is 889 and it has 5 holes.

		Input: 9990
		Output: The number is 9990 and it has 4 holes. 
*/

import java.util.Scanner;

public class FindHolesInNumbers
{	
	public static void main(String[] args) 
	{ 
		int inputNumber = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		inputNumber = keyboard.nextInt();
		
		while(inputNumber >= 0)
		{
			System.out.println("The number is: " + inputNumber + " and it has " + returnHolesInNumbers(inputNumber) + " holes.");
			System.out.println("----------------------------------------------------------\n");
			System.out.println("Enter a number: ");
			inputNumber = keyboard.nextInt();
		}
		
		keyboard.close();
	}
	
	public static int returnHoles(char singleDigit)
	{
		int digitReturned = 0;

		if (singleDigit == '0')
			digitReturned = 1;
		else if (singleDigit == '1')
			digitReturned = 0;
		else if (singleDigit == '2')
			digitReturned = 0;
		else if (singleDigit == '3')
			digitReturned = 0;
		else if (singleDigit == '4')
			digitReturned = 0;
		else if (singleDigit == '5')
			digitReturned = 0;
		else if (singleDigit == '6')
			digitReturned = 1;
		else if (singleDigit == '7')
			digitReturned = 0;
		else if (singleDigit == '8')
			digitReturned = 2;
		else if (singleDigit == '9')
			digitReturned = 1;
		
		return digitReturned;
	}
	
	public static int returnHolesInNumbers(int number)
	{
		String numberString = Integer.toString(number);
		int strLen = numberString.length();
		int numberOfHoles = 0;
		
		for(int i = 0; i < strLen; ++i)
		{
			numberOfHoles += returnHoles(numberString.charAt(i));
		}
		
		return numberOfHoles;
	}

}

/* reverses a string that is entered */

import java.util.Scanner;

public class reverseString 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		String reversedString = reverseString(keyboard.nextLine());
		System.out.println(reversedString);
	}
	
	public static String reverseString(String stringToReverse)
	{
		String result = "";
		int strLen = stringToReverse.length();
		
		for(int j = strLen - 1;  j >= 0; --j)
		{
			result += stringToReverse.charAt(j);
		}
		
		return result;
	}

}

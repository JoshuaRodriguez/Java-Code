/*
Given a number n and two integers p1, p2 determine if the bits in position p1 and p2 are the same or not. Positions p1 and p2 are 1 based.
Input sample:
                1 -- 86,2,3
                2 -- 125,1,2
                
The first argument will be a path to a filename containing a comma separated list of 3 integers, one list per line. E.g.
Output sample:
                1 -- true
                2 -- false
                
Print to stdout, 'true'(lowercase) if the bits are the same, else 'false'(lowercase). E.g.

*/

import java.io.*;
import java.util.*;

public class Main 
{
    public static void main (String[] args) throws IOException 
    {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = buffer.readLine()) != null) 
        {
            int[] numbers = new int[3];
            int i = 0;
            line = line.trim();
            StringTokenizer numberFactory = new StringTokenizer(line, ",");
            
            while(numberFactory.hasMoreTokens())
            {
                String number = numberFactory.nextToken();
                numbers[i] = Integer.parseInt(number);
                i++;
            }
            
            ArrayList<String> numberArg1 = new ArrayList<String>();
		
		    numberArg1 = convertNumberToBits(numbers[0]);
		
		    System.out.println(sameBitInPos(numbers[1], numbers[2], numberArg1));
        }
    }
    
    static ArrayList<String> convertNumberToBits(int numberToConvert)
	{
		ArrayList<String> tempBitArray = new ArrayList<String>();
		ArrayList<String> bitArray = new ArrayList<String>();
		
		while(numberToConvert != 0)
		{
			if(numberToConvert % 2 == 0)
				tempBitArray.add("0");
			else 
				tempBitArray.add("1");
			
			numberToConvert /= 2;
		}
		
		for(int i = tempBitArray.size() - 1; i >= 0; --i)
		{
			bitArray.add(tempBitArray.get(i));
		}
		
		return bitArray;
	}
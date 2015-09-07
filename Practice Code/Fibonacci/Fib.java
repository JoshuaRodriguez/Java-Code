/* 
Create a class called Fib that contains a constructor with parameters f0 and f1.

and contains two functions called f and fRec that generate fibonacci numbers

iteratively and recursively respectively
*/

package q1;

public class Fib 
{
	/**
	 * Constructs an instance of the Fib class
	 * @param f0 starting value for f0 in Fibonacci sequence
	 * @param f1 starting value for f1 in Fibonacci sequence
	 */
	public Fib(int f0, int f1)
	{
		this.f0 = f0;
		this.f1 = f1;
	}
	
	/**
	 * Computes F(n) using an iterative algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition
	 * @param  calculates up to nth number of Fibonacci sequence to find
	 * @return nth number of the Fibonacci sequence 
	 * @throws Exception if n is less than 0
	 */
	public int f(int n) throws Exception
	{
		int f0temp = this.f0;
		int f1temp = this.f1;
		int f2temp = 0;
		
		if(n < 0)
		{
			throw new Exception("Input cannot be less than zero!");
		}
		
		if(n == 0)
			return this.f0;
		
		if(n == 1)
			return this.f1;
		
		if(n >= 2)
		{
			for(int i = 1; i < n; i++)
			{
				f2temp = f0temp + f1temp;
				f0temp = f1temp;
				f1temp = f2temp;
			}
		}
		
		return f2temp;
	}
	
	/**
	 * Computes F(n) using a recursive algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition
	 * @param calculates up to nth number of fibonnaci sequence to find
	 * @return nth number of the Fibonacci sequence
	 * @throws Exception if n is less than 0
	 */
	public int fRec(int n) throws Exception
	{
		if(n < 0)
		{
			throw new Exception("Input cannot be less than zero!");
		}
		
		if(n == 0)
		{
			return this.f0;
		}
		
		if(n == 1)
		{
			return this.f1;
		}
		else 
			return (fRec(n-1) + fRec(n-2));
	}
	
	public static void main(String[] args) 
	{
		try
		{	
			if(args.length == 0 || args.length == 1 || args.length == 2)
			{
				throw new IllegalArgumentException("Missing input");
			}
			
			int f0 = Integer.parseInt(args[0]);
			int f1 = Integer.parseInt(args[1]);
			int n = Integer.parseInt(args[2]);
			
			if(f0 < 0 || f1 < 0)
			{
				throw new Exception("f0 or f1 cannot be less than zero!");
			}
			
			if(n < 0)
			{
				throw new Exception ("Range cannot be less than zero!");
			}
			
			Fib fibGenerator = new Fib(f0, f1);
			
			// prints fibonacci number up to nth fibonacci in the sequence
			for(int i = 0; i <= n; i++)
			{
				System.out.print(fibGenerator.f(i) + " ");
			}
			
			System.out.println("\n-----------------------------------------");
			
			// prints fibonacci number up to nth fibonacci in the sequence
			for(int i = 0; i <= n; i++)
			{
				System.out.print(fibGenerator.fRec(i) + " ");
			}
			
			System.out.println("\n");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage() + "PPPP");
		}
	}
	
	private int f0;
	private int f1;
}

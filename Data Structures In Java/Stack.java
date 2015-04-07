
public class Stack 
{
	private int[] stackArray;
	private int capacityOfStack;
	private int top;
	
	// Constructor //
	public Stack(int stackSize)
	{
		stackArray = new int[stackSize];
		capacityOfStack = stackSize;
		top = 0;
	}
	
	// Copy Constructor //
	public Stack(Stack stackToBeCopied)
	{
		stackArray = new int[stackToBeCopied.capacityOfStack];
		capacityOfStack = stackToBeCopied.capacityOfStack;
		top = stackToBeCopied.top;
		
		for(int index = 0; index < top; ++index)
		{
			stackArray[index] = stackToBeCopied.stackArray[index];
		}
	}
	
	// push_back method - adds new element to the top of the stack //
	public void push_back(int value)
	{
		if(this.checkIfFull())
		{
			System.out.println("The stack is full! Cannot add anymore elements!");
		}
		else
		{
			stackArray[top] = value;
			top++;
		}
	}
	
	// pop method - removes element at the top of the stack //
	public void pop()
	{
		if(this.checkIfEmpty())
			System.out.println("Stack is empty cannot remove anymore elements!");
		else
			top--;
	}
	
	// capacity method - returns total capacity of the stack //
	public int capacity()
	{
		return capacityOfStack;
	}
	
	// length method - returns the current size of the stack //
	public int length()
	{
		return top;
	}
	
	// retrieveValue method - returns value at the top of the stack // 
	public int retrieveValue()
	{
		return stackArray[top - 1];
	}
	
	// displayStack method - displays the stack //
	public void displayStack()
	{
		int elementNumber = 1;
		
		if(top == 0)
		{
			System.out.println("Stack is Empty!");
		}
		
		for(int index = 0; index < top; ++index)
		{
			System.out.println("Element " + elementNumber + ": " + stackArray[index]);
			elementNumber++;
		}
	}

	// checkIfFull method - checks to see if the stack is full //
	private boolean checkIfFull()
	{
		if(top == capacityOfStack)
			return true;
		else
			return false;
	}

	// checkIfEmpty method - checks to see if the stack is empty //
	private boolean checkIfEmpty()
	{
		if(top == 0)
			return true;
		else
			return false;
	}

	// equals method - checks to see if stacks are equal //
	public boolean equals(Stack stackToTestEquality)
	{
		if(capacityOfStack == stackToTestEquality.capacityOfStack && top == stackToTestEquality.top)
		{
			for(int index = 0; index < top; ++index)
			{
				if(stackArray[index] != stackToTestEquality.stackArray[index])
					return false;
			}
			
			return true;
		}
		else
			return false;
	}
}


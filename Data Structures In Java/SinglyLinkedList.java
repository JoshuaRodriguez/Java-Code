
public class SinglyLinkedList 
{
	/**
	 * Constructs an empty singly linked list
	 */
	public SinglyLinkedList()
	{
		head = new Node(null);
		listCount = 0;
	}
	
	/**
	 * Adds an Object to the singly linked list
	 * @param data Object to be added to the singly linked list
	 */
	public void add(Object data)
	{
		Node temp = new Node(data);
		Node current = head;
		
		while(current.getNext() != null)
		{
			current = current.getNext();
		}

		current.setNext(temp);
		
		listCount++;
	}
	
	/**
	 * Adds an Object to the singly linked list with a specified index
	 * @param data Object to be added to the singly linked list
	 * @param index position to insert Object in
	 */
	public void add(Object data, int index)
	{
		Node temp = new Node(data);
		Node current = head;
		
		for(int i = 1; i < index && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		
		temp.setNext(current.getNext());
		current.setNext(temp);
		
		listCount++;
	}
	
	/**
	 * Returns an Object from specified index
	 * @param index index to retrieve Object from
	 * @return returns Object from specified index
	 */
	public Object get(int index)
	{
		if(index <= 0)
			return null;
		
		Node current = head.getNext();
		
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
			{
				return null;
			}
			
			current = current.getNext();
		}
		
		return current.getData();
	}
	
	/**
	 * Removes a node from the singly linked list at a specified index
	 * @param index
	 * @return returns true, or false if remove operation was not succesful
	 */
	public boolean remove(int index)
	{
		if(index < 1 || index > size())
		{
			return false;
		}
		
		Node current = head;
		
		for (int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return false;
			
			current = current.getNext();
		}
		
		current.setNext(current.getNext().getNext());
		listCount--;
		
		return true;
	}
	
	/**
	 * Checks the size of the singly linked lsit
	 * @return size of the singly linked list
	 */
	public int size()
	{
		return listCount;
	}
	
	private Node head;
	private int listCount;
	
	private class Node
	{
		/**
		 * Constructs a Node
		 * @param savedData Object to add to node
		 */
		public Node(Object savedData)
		{
			data = savedData;
			next = null;
		}
		
		/**
		 * Constructs a Node and has a reference to a new node
		 * @param savedData Object to add to node
		 * @param nextNode reference to a new node
		 */
		public Node(Object savedData, Node nextNode)
		{
			data = savedData;
			next = nextNode;
		}
		
		/**
		 * Returns a reference to a node that the calling object is pointing to
		 * @return reference to the node the calling object points to
		 */
		public Node getNext()
		{
			return next;
		}
		
		/**
		 * set calling Node's pointer to new node
		 * @param nextNode New node to point to
		 */
		public void setNext(Node nextNode)
		{
			next = nextNode;
		}
		
		/**
		 * Gives you data saved within the Node
		 * @return data from Node
		 */
		public Object getData()
		{
			return data;
		}
		
		/**
		 * 
		 * @param savedData 
		 */
		public void setData(Object savedData)
		{
			data = savedData;
		}
		
		private Node next;
		private Object data;
	}
}

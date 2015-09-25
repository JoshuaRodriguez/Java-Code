import java.util.Scanner;

public class testRegister 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String userInput = "";
		
		// created a database called publixInventory, and added some items to the database
		
		ProductDataBase publixInventory = new ProductDataBase();
		publixInventory.addProduct(new Product("Milk", 4.57, "101"));
		publixInventory.addProduct(new Product("Eggs", 3.99, "102"));
		publixInventory.addProduct(new Product("Cheese", 2.89, "103"));
		publixInventory.addProduct(new Product("Bread", 3.54, "104"));
		publixInventory.addProduct(new Product("Water", 0.99, "105"));
	
		Register publixRegister = new Register(publixInventory);
		
		try
		{
			while(true)
			{
				userInput = in.nextLine();
			
				if(userInput.equals("STOP") || userInput.equals("QUIT"))
					break;
			
				System.out.println(publixRegister.scanItem(userInput));
			}
		
			System.out.println(publixRegister.closeSale());
			in.close();
		}
		catch(NullPointerException e)
		{
			
		}

	}
}

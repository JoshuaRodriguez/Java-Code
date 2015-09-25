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
		publixInventory.addProduct(new Product("Bread", 3.50, "104"));
		publixInventory.addProduct(new Product("Water", 1.89, "105"));
		
//		Product Milk = new Product("Milk", 4.57, "805718230748123");
//		Product Water = new Product("Water", 1.89, "805999230748123");
//		Product Cheese = new Product("Cheese", 2.89, "805718266648123");
	
		Register publixRegister = new Register(publixInventory);
		
		while(true)
		{
			userInput = in.nextLine();
			
			if(userInput.equals("STOP"))
				break;
			
			System.out.println(publixRegister.scanItem(userInput));
		}
		
		System.out.println(publixRegister.closeSale());
		in.close();
	}

}

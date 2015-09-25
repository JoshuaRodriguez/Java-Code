
public class Receipt 
{	
	/**
	 * Creates a Receipt object
	 */
	public Receipt()
	{
		receipt = "Thank you for shopping at Publix!\n" 
				+ "---------------------------------\n\n";
	}
	
	/**
	 * displays the receipt
	 * @return a String containing all products purchased
	 */
	public String show()
	{
		return receipt;
	}
	
	
	/**
	 * adds a Product to the receipt
	 * @param item Product to add
	 */
	public void addTo(Product item)
	{
		receipt += item.getProductInfo();
	}
	
	private String receipt;
}

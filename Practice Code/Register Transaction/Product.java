
public class Product 
{
	/**
	 * creates a new Product object
	 * @param prodName Name of the product
	 * @param prodPrice Price of the product
	 * @param upc_code UPC code of the product
	 */
	public Product(String prodName, double prodPrice, String upc_code)
	{
		this.upc_code = upc_code;
		name = prodName;
		price = prodPrice;
	}
	
	/**
	 * creates a deep copy of a product object
	 * @param copyProduct
	 */
	public Product(Product copyProduct)
	{
		name = copyProduct.name;
		price = copyProduct.price;
		this.upc_code = copyProduct.upc_code;
	}

	/**
	 * retrieves product name
	 * @return product name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * retrieves product price
	 * @return product price
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * retrieves UPC Code from product
	 * @return UPC Code
	 */
	public String getUPCCode()
	{
		return upc_code;
	}
	
	/**
	 * retrieves the products information
	 * @return returns a string of the product Name, Price, and UPC Code
	 */
	public String getProductInfo()
	{
		return "Item: "     + name     + "\n" +
			   "Price: $"   + price    + "\n" +
			   "UPC CODE: " + upc_code + "\n\n";
	}
	
	private String upc_code;
	private String name;
	private double price;
}

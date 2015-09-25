import java.util.HashMap;
import java.util.Map;

public class ProductDataBase 
{
	/**
	 * creates a ProductDataBase object
	 */
	public ProductDataBase()
	{
		products = new HashMap<String, Product>();
	}
	
	
	/**
	 * creates a deep copy of a ProductDataBase object,
	 * @param copyDataBase ProductDataBase object to copy
	 */
	public ProductDataBase(ProductDataBase copyDataBase)
	{
		products = copyDataBase.getDataBase();
	}
	
	/**
	 * adds a product to the product database
	 * @param item Product object to be added to the database
	 */
	public void addProduct(Product item)
	{
		products.put(item.getUPCCode(), new Product(item));
	}
	
	/**
	 * retrieves product from the database
	 * @param itemName name of the product to find
	 * @return Product object specified in the parameter of the function
	 */
	public Product getProduct(String barCode)
	{
		return products.get(barCode);
	}
	
	/**
	 * retrieves entire database
	 * @return a new ProductDataBase Instance of the current Database
	 */
	private Map<String, Product> getDataBase()
	{
		return new HashMap<String, Product>(products);
	}
	
	private Map<String, Product> products;
}

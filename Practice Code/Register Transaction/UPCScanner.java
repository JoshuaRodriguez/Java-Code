
public class UPCScanner 
{
	/**
	 * creates a UPCScanner object
	 */
	public UPCScanner()
	{
		
	}
	
	/**
	 * scans a Product
	 * @param item Product to scan
	 * @return UPC Code of the product scanned
	 */
	public String scan(Product item)
	{
		return item.getUPCCode();
	}
}

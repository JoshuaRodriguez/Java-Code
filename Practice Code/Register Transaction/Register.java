import java.text.DecimalFormat;
import java.util.ArrayList;

public class Register 
{	
	/**
	 * creates a new Register object 
	 * @param foodInventory ProductDataBase object to save into register
	 */
	public Register(ProductDataBase foodInventory)
	{
		barCodeScanner = new UPCScanner();
		storeInventory = foodInventory;
		receipt = new Receipt();
		scannedItems = new ArrayList<Product>();
	}
	
	/**
	 * creates a deep copy of the Register object
	 * @param copyRegister Register object to copy
	 */
	public Register(Register copyRegister)
	{
		barCodeScanner = new UPCScanner();
		storeInventory = new ProductDataBase(copyRegister.storeInventory);
	}
	
	/**
	 * scans an item into the register
	 * @param item Product to scan into the register
	 * @return displays product name, price, and upc_code
	 */
	public String scanItem(Product item)
	{
		String barCode = barCodeScanner.scan(item);
		Product itemFromDataBase = storeInventory.getProduct(barCode);
		
		if(itemFromDataBase == null)
			return "No item Found";
		
		scannedItems.add(itemFromDataBase);
		receipt.addTo(itemFromDataBase);
		return itemFromDataBase.getProductInfo();
	}
	
	/**
	 * scans an item into the register
	 * @param barCode UPC Code of the product
	 * @return displays product name, price, and upc_code
	 * @throws Exception if item not found throw exception
	 */
	public String scanItem(String barCode)
	{
		
		Product itemFromDataBase = storeInventory.getProduct(barCodeScanner.scan(barCode));
		
		if(itemFromDataBase == null)
			return "No item Found";
		
		scannedItems.add(itemFromDataBase);
		receipt.addTo(itemFromDataBase);
		return itemFromDataBase.getProductInfo();
	}
	
	/**
	 * creates a printed receipt
	 * @return a string of all items scanned in
	 */
	private String printReceipt()
	{
		Double grandTotal = 0.0;
		
		for(Product item : scannedItems)
		{
			grandTotal += item.getPrice();
		}
		
		return receipt.show() + "\nGrand Total: $" + new DecimalFormat("#.##").format(grandTotal)
				              + "\nCash/Credit: $" + money
				              + "\nChange: $"      + new DecimalFormat("#.##").format(money - grandTotal);
	}
	
	/**
	 * closes the current tranasction
	 * @return sales receipt of all items purchased
	 */
	public String closeSale()
	{
		String salesReceipt = printReceipt();
		scannedItems.clear();
		return salesReceipt;
	}
	
	public void receivePayment(double pay)
	{
		if(pay < grandTotal)
		money = pay;
	}
	
	private UPCScanner barCodeScanner;
	private ProductDataBase storeInventory;
	private ArrayList<Product> scannedItems;
	private Receipt receipt;
	private double money;
	private double grandTotal;
}

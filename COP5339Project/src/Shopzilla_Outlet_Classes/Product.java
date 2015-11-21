package Shopzilla_Outlet_Classes;

import java.text.DecimalFormat;

public class Product 
{
    /**
     * Constructs a Product object
     * @param aName a product name
     * @param anID a product ID
     * @param aType a product type
     * @param aQuantity quantity of the product
     * @param itsInvoicePrice the products invoice price
     * @param itsSellingPrice  the products selling price
     */
    public Product(String aName, String anID, String aType, int aQuantity, double itsInvoicePrice, double itsSellingPrice) {
        ID = anID;
        name = aName;
        type = aType;
        quantity = aQuantity;
        invoicePrice = itsInvoicePrice;
        sellingPrice = itsSellingPrice;
    }
    
    /**
     * Creates a copy of a Product object
     * @param copyOfProduct 
     */
    public Product(Product copyOfProduct)
    {
        ID = copyOfProduct.ID;
        name = copyOfProduct.name;
        type = copyOfProduct.type;
        quantity = copyOfProduct.quantity;
        invoicePrice = copyOfProduct.invoicePrice;
        sellingPrice = copyOfProduct.sellingPrice;
    }
    
    /**
     * Returns the Product object ID
     * @return product ID code
     */
    public String getID() {
        return ID;
    }

    /**
     * Returns type of the Product object (I.E. Food, Electronics, etc..)
     * @return product type
     */
    public String getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }

    /**
     * Returns the quantity of the Product object
     * @return quantity of product
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Returns the invoice price of the product object
     * @return invoice price
     */
    public double getInvoicePrice() {
        return invoicePrice;
    }

    /**
     * Returns the selling price of the Product object
     * @return selling price
     */
    public double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Sets an ID for the Product object
     * @param ID 
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets a product type for the Product Object
     * @param type a product type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets a quantity for the Product object
     * @param quantity a specified quantity 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets an invoice price for the Product object
     * @param invoicePrice a specified price
     */
    public void setInvoicePrice(double invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    
    /**
     * String representation of the Product object
     * @return Product object information
     */
    public String toString()
    {
        DecimalFormat formatter = new DecimalFormat("#.##");
        
        return "Item: " + name + "\nInvoice Price: $" + formatter.format(invoicePrice) + 
               "\nSelling Price: $" + formatter.format(sellingPrice) + "\nQuantity: "  + 
                quantity + "\nID: " + ID + "\nType: " + type;
    }
    
    /**
     * Compares to products to see if they are the same
     * @param otherProduct Product object to compare with
     * @return returns true if the products are the same, or false if they are not the same
     */
    public boolean equals(Object otherProduct) {
        if(otherProduct == null)
            return false;
        else if(getClass() != otherProduct.getClass())
            return false;
        else 
        {
            Product checkProduct = (Product)otherProduct;
            return (ID.equals(checkProduct.ID) && name.equals(checkProduct.name) && type.equals(checkProduct.type) && 
                    quantity == checkProduct.quantity && invoicePrice == checkProduct.invoicePrice && 
                    sellingPrice == checkProduct.sellingPrice);
        }
    }
    
    private String ID;
    private String name;
    private String type;
    private int quantity;
    private double invoicePrice;
    private double sellingPrice;
}

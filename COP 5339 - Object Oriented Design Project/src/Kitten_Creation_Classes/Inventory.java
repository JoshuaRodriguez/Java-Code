package Kitten_Creation_Classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Inventory implements Serializable
{
    /**
     * Constructs an Inventory object
     */
    public Inventory() {
        theInventory = new ArrayList<>();
    }
    
    /**
     * Constructs a copy of an Inventory object
     * @param copyInventory 
     */
    public Inventory(Inventory copyInventory) {
        theInventory = new ArrayList<>(copyInventory.theInventory);
    }
    
    /**
     * Adds an item to the inventory
     * @param item Product object to add to inventory
     */
    public void add(Product item) {
        theInventory.add(item);
        inventoryTotal += item.getQuantity() * item.getInvoicePrice();
    }
    
    /**
     * Removes an item from the inventory
     * @param anID String ID to locate proper item
     */
    public void remove(String anID) {
        for(Product item : theInventory) {
            if(anID.equals(item.getID())) {
                theInventory.remove(item);
                break;
            }
        }
    }
    
    /**
     * Clears out entire inventory
     */
    public void clear() {
        theInventory.clear();
    }
    
    /**
     * Checks to see if the inventory is empty
     * @return true if inventory is empty, false otherwise
     */
    public boolean isEmpty() {
        return theInventory.isEmpty();
    }
    
    /**
     * Retrieves a specified product in the Sellers inventory
     * @param anID a Product ID number
     * @return the Product specified via the ID number
     */
    public Product getProduct(String anID) {
        Product itemToGet = null;
        
        for(Product item : theInventory) {
            if(item.getID().equals(anID)) {
                itemToGet = item;
                break;
            }
        }
        
        return new Product(itemToGet);
    }
    
    /**
     * Retrieves a specified product in the Sellers inventory
     * @param anID a Product ID Number
     * @return the Product specified via the ID Number (as a reference) 
     */
    public Product getProductInstance(String anID) {
        Product itemToGet = null;
        
        for(Product item : theInventory) {
            if(item.getID().equals(anID)) {
                itemToGet = item;
                break;
            }
        }
        
        return itemToGet;
    }
    
    /**
     * Returns a list of all items in the inventory
     * @return an ArrayList of Product objects
     */
    public ArrayList<Product> getAllItems() {
        return new ArrayList<>(theInventory);
    }
    
    /**
     * Adds incurred costs to the Sellers lifetime spending 
     * @param incurredCost an incurred cost of type double
     */
    public void addToLifeTimeInventoryCosts(double incurredCost) {
        inventoryTotal += incurredCost;
    }
    
    /**
     * Retrieves the total lifetime spending of the Seller on inventory
     * @return 
     */
    public double getLifeTimeInventoryCosts() {
        return inventoryTotal;
    }
    
    public void changeProductOwnerShip(String userName) {
        for(Product item : theInventory) {
            item.setSeller(userName);
        }
    }
    
    /**
     * Returns a String representation of all Products in the inventory
     * @return a String representation of all the products found in the sellers inventory
     */
    public String toString() {
        String inventoryOutput = "";
        
        for(Product item : theInventory)
            inventoryOutput += item.toString() + "\n\n";
        
        return inventoryOutput;
    }
    
    /** 
     * Checks to see the equality of two Inventory objects
     * @param otherInventory Inventory object to compare
     * @return true if equal, otherwise false
     */
    public boolean equals(Inventory otherInventory) {
        if(otherInventory == null)
            return false;
        else if(getClass() != otherInventory.getClass())
            return false;
        else {
            Inventory checkInventory = (Inventory)otherInventory;
            return (theInventory.equals(checkInventory.theInventory));
        }
    }
    
    private ArrayList<Product> theInventory;
    private double inventoryTotal;
}

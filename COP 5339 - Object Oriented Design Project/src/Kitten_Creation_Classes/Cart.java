package Kitten_Creation_Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Cart implements Serializable
{
    /**
     * Constructs an empty Cart object
     */
    public Cart() {
        items = new ArrayList<>();
        cartTotal = 0.00;
        isEmpty = true;
    }
    
    /**
     * Constructs a copy of an existing Cart object
     * @param copyCart a Cart object
     */
    public Cart(Cart copyCart) {
        items = new ArrayList<>(copyCart.items);
    }
    
    /**
     * Adds an item to the Cart
     * @param anItem a Product type item
     * @precondition a Cart object must exist
     * @postcondition an item is added to the cart
     */
    public void add(Product anItem) {
        items.add(anItem);
        
        if(!items.isEmpty())
            isEmpty = false;
    }
    
    /**
     * Removes an item from the cart via item ID
     * @param anID a Product ID
     * @precondition Cart must not be empty
     * @postcondition Selected item is removed from the cart
     */
    public void remove(String anID) {
        if(items.isEmpty())
            return;
        
        for(Product item : items) {
            if(anID.equals(item.getID())) {
                items.remove(item);
                break;
            }
        }
        
        if(items.isEmpty())
            isEmpty = true;
    }
    
    /**
     * Searches for a product in the Cart via an ID
     * @param anID a product ID number
     * @return true or false depending if the item exists in the cart
     */
    public boolean search(String anID) {
        if(items.isEmpty())
            return false;
        
        for(Product item : items) {
            if(anID.equals(item.getID())) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Returns the total of all items in the cart
     * @return total value of items in cart
     */
    public double calculateCartTotal() {
        cartTotal = 0;
        for(Product item : items) {
            cartTotal += (double)(item.getQuantity() * item.getSellingPrice());
        }
        
        return cartTotal;
    }
    
    /**
     * Empties out the Cart
     */
    public void clear() {
        items.clear();
        isEmpty = true;
    }
    
    /**
     * Checks to see if the cart is completely empty
     * @return true or false if the cart is empty or not empty
     */
    public boolean isEmpty() {
        return isEmpty;
    }
    
    /**
     * Retrieves a specified product in the shopping cart
     * @param anID a Product ID number
     * @return the Product specified via the ID number
     */
    public Product getProduct(String anID) {
        Product itemToGet = null;
        
        for(Product item : items) {
            if(item.getID().equals(anID)) {
                itemToGet = item;
                break;
            }
        }
        
        return new Product(itemToGet);
    }
    
    /**
     * Retrieves a specified product in the shopping cart
     * @param anID a Product ID Number
     * @return the Product specified via the ID Number (as a reference) 
     */
    public Product getProductInstance(String anID) {
        Product itemToGet = null;
        
        for(Product item : items) {
            if(item.getID().equals(anID)) {
                itemToGet = item;
                break;
            }
        }
        
        return itemToGet;
    }
    
    /**
     * Retrieves all items in the cart
     * @return an ArrayList of items from the cart
     */
    public ArrayList<Product> getAllItems() {
        return new ArrayList<>(items);
    }
    
    
    /**
     * Checks the size of the cart
     * @return the current size of the cart
     */
    public int size() {
        return items.size();
    }
    
    /**
     * Returns a string representation of all items in the Cart
     * @return string representation of everything in the Cart
     */
    public String toString() {
        String cartOutput = "";
        
        cartIterator = items.iterator();
        
        while(cartIterator.hasNext()) {
            cartOutput += cartIterator.next().toString() + "\n\n";
        }
        
//        for(Product item : items) {
//            cartOutput += item.toString() + "\n\n";
//        }
        
        return cartOutput;
    }
    
    /**
     * Checks to see if the cart is the same as another cart
     * @param otherCart another Cart object to check with
     * @return returns true if carts are the same, or returns false if carts are different
     */
    @Override
    public boolean equals(Object otherCart) {
        if(otherCart == null)
            return false;
        else if(getClass() != otherCart.getClass())
            return false;
        else {
            Cart checkCart = (Cart)otherCart;
            return (items.equals(checkCart.items));
        }
    }
       
    private final ArrayList<Product> items;
    Iterator<Product> cartIterator;
    private double cartTotal;
    private boolean isEmpty;
}

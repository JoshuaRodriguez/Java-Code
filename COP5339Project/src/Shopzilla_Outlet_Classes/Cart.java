package Shopzilla_Outlet_Classes;

import java.util.ArrayList;

public class Cart 
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
    public Cart(Cart copyCart)
    {
        items = new ArrayList<>();
        
        for(Product item : copyCart.items) {
            items.add(new Product(item));
        }
        
        cartTotal = copyCart.cartTotal;
        isEmpty = copyCart.isEmpty;
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
        
        cartTotal += anItem.getSellingPrice();
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
        
        double itemCost = 0;
        
        for(Product item : items) {
            if(anID.equals(item.getID())) {
                itemCost = item.getSellingPrice();
                items.remove(item);
                break;
            }
        }
        
        if(items.isEmpty())
            isEmpty = true;
        
        cartTotal -= itemCost;
    }
    
    /**
     * Returns the total of all items in the cart
     * @return total value of items in cart
     */
    public double getCartTotal() {
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
        
        for(Product item : items)
            cartOutput += item.toString() + "\n\n";
        
        return cartOutput;
    }
    
    /**
     * Checks to see if the cart is the same as another cart
     * @param otherCart another Cart object to check with
     * @return returns true if carts are the same, or returns false if carts are different
     */
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
    private double cartTotal;
    private boolean isEmpty;
}

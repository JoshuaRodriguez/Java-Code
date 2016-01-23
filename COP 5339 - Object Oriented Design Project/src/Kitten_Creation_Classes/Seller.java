package Kitten_Creation_Classes;

import java.io.Serializable;

public class Seller extends Account implements Serializable
{
    /**
     * Constructs a Seller object
     * @param fullName
     * @param userName
     * @param passWord
     * @param creditCardNumber
     * @param ccvNumber 
     */
    public Seller(String fullName, String userName, String passWord, String creditCardNumber, String ccvNumber) {
        super(fullName, userName, passWord, creditCardNumber, ccvNumber);
        sellersInventory = new Inventory();
    }
    
    /**
     * Constructs a deep copy of a Seller object
     * @param copySellerAccount a Seller object
     */
    public Seller(Seller copySellerAccount) {
        super(copySellerAccount);
        sellersInventory = new Inventory(copySellerAccount.sellersInventory);
    }
    
    /**
     * Retrieves the inventory of the Seller
     * @return a reference to the inventory of the Seller 
     */
    public Inventory getInventory() {
        return sellersInventory;
    }
    
    /**
     * Retrieves the revenue made by the Seller
     * @return the revenue made by the seller
     */
    public double getRevenue() {
        return revenue;
    }
    
    /**
     * Retrieves the profit made by the Seller
     * @return the profit made by the seller
     */
    public double getProfit() {
        return profit;
    }
    
    /**
     * Adds to the total revenue made by the Seller
     * @param totalOfSoldItems an amount of revenue made by Seller
     */
    public void calculateRevenue(double totalOfSoldItems) {
        revenue += totalOfSoldItems;
    }
    
    /**
     * Calculates the total profit made by the Seller
     * @return the total profit made by the seller
     */
    public double calculateProfit() {
        return revenue - getInventory().getLifeTimeInventoryCosts();
    }
    
    /**
     * Returns a String representation of the Seller which contains the
     * Sellers full name, user name, password, credit card number, CCV number,
     * account type, and all the items inside the Sellers inventory
     * @return 
     */
    @Override
    public String toString() {
        String sellerInfo = "Shopzilla Outlet Account" + "\n\nFull Name: " + super.getFullName() + "\nUser Name: " + super.getUserName() + 
                "\nPassword: " + super.getPassWord() + "\nCredit Card Number: " + super.getCreditCardNumber() + "\nCCV Number: " +
                super.getCCV() + "\nAccount Type: Seller\n\n" + super.getFullName() + "'s Inventory\n\n" + sellersInventory.toString();
        
        return sellerInfo;
    }
    
    /**
     * Checks to see if two Sellers are identical, this checks to see
     * all instances of what comprises the Seller object are identical
     * All Seller fields, and inventory and products inside the inventory
     * must be identical, this even includes the fields of the products themselves
     * @param otherSeller an instance of a Seller object
     * @return true or false depending if the seller objects are equal
     */
    @Override
    public boolean equals(Object otherSeller) {
        if(otherSeller == null)
            return false;
        else if(getClass() != otherSeller.getClass())
            return false;
        else {
            Seller checkSeller = (Seller)otherSeller;
            return (super.getFullName().equals(checkSeller.getFullName()) && super.getUserName().equals(checkSeller.getUserName()) && 
                    super.getPassWord().equals(checkSeller.getPassWord()) && super.getCCV().equals(checkSeller.getCCV()) &&
                    super.getCreditCardNumber().equals(checkSeller.getCreditCardNumber()) && sellersInventory.equals(checkSeller.sellersInventory));
        }
    }
    
    private final boolean accountType = true;
    private final Inventory sellersInventory;
    private double revenue;
    private double profit;
}

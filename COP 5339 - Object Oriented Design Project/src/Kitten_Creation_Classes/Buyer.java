package Kitten_Creation_Classes;

import java.io.Serializable;

public class Buyer extends Account implements Serializable
{
    /**
     * Constructs a Buyer object
     * @param fullName a String representing the full name of the account holder
     * @param userName a String representing the user name of the account
     * @param passWord a String representing the password of the account
     * @param creditCardNumber a String representing the credit card number on the account
     * @param ccvNumber a String representing the CCV number of the credit card on the account
     */
    public Buyer(String fullName, String userName, String passWord, String creditCardNumber, String ccvNumber) {
        super(fullName, userName, passWord, creditCardNumber, ccvNumber);
        buyersCart = new Cart();
    }
    
    /**
     * Creates a copy of a Buyer object
     * @param copyBuyer 
     */
    public Buyer(Buyer copyBuyer) {
        super(copyBuyer);
        buyersCart = new Cart(copyBuyer.buyersCart);
    }
    
    /**
     * Returns the buyers cart
     * @return a reference to the buyers cart
     */
    public Cart getCart() {
        return buyersCart;
    }
    
    /**
     * A string representation of the Buyer object
     * @return a String containing all information about the Buyer object
     */
    @Override
    public String toString() {
        String buyerInfo = "Shopzilla Outlet Account" + "\n\nFull Name: " + super.getFullName() + "\nUser Name: " + super.getUserName() + 
                "\nPassword: " + super.getPassWord() + "\nCredit Card Number: " + super.getCreditCardNumber() + "\nCCV Number: " +
                super.getCCV() + "\nAccount Type: Buyer\n\n" + super.getFullName() + "'s Cart\n\n" + buyersCart.toString();
        
        return buyerInfo;
    }
    
    /**
     * Checks to see if two Buyer objects are the same
     * @param otherBuyer a Buyer object
     * @return returns true or false depending if Buyer objects are equal or not
     */
    @Override
    public boolean equals(Object otherBuyer) {
        if(otherBuyer == null)
            return false;
        else if(getClass() != otherBuyer.getClass())
            return false;
        else {
            Buyer checkBuyer = (Buyer)otherBuyer;
            return (super.getFullName().equals(checkBuyer.getFullName()) && super.getUserName().equals(checkBuyer.getUserName()) && 
                    super.getPassWord().equals(checkBuyer.getPassWord()) && super.getCCV().equals(checkBuyer.getCCV()) &&
                    super.getCreditCardNumber().equals(checkBuyer.getCreditCardNumber()) && buyersCart.equals(checkBuyer.buyersCart));
        }
    }
    
    private final boolean accountType = false;
    private final Cart buyersCart;
}

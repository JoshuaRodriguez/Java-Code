package Shopzilla_Outlet_Classes;

public class Buyer extends Account 
{
    /**
     * 
     * @param fullName
     * @param userName
     * @param passWord
     * @param creditCardNumber
     * @param ccvNumber 
     */
    public Buyer(String fullName, String userName, String passWord, String creditCardNumber, String ccvNumber) {
        super(fullName, userName, passWord, creditCardNumber, ccvNumber);
        buyersCart = new Cart();
    }
    
    /**
     * 
     * @param copyBuyer 
     */
    public Buyer(Buyer copyBuyer) {
        super(copyBuyer);
        buyersCart = new Cart(copyBuyer.getCart());
    }

    /**
     * 
     * @return 
     */
    public boolean isAccountType() {
        return accountType;
    }
    
    /**
     * 
     * @return 
     */
    public Cart getCart() {
        return buyersCart;
    }
    
    /**
     * 
     * @return 
     */
    public String toString() {
        String buyerInfo = "Shopzilla Outlet Account" + "\n\nFull Name: " + super.getFullName() + "\nUser Name: " + super.getUserName() + 
                "\nPassword: " + super.getPassWord() + "\nCredit Card Number: " + super.getCreditCardNumber() + "\nCCV Number: " +
                super.getCCV() + "\nAccount Type: Buyer\n\n" + super.getFullName() + "'s Cart\n\n" + buyersCart.toString();
        
        return buyerInfo;
    }
    
    /**
     * 
     * @param otherBuyer
     * @return 
     */
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

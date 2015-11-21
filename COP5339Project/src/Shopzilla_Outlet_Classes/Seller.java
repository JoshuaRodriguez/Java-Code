package Shopzilla_Outlet_Classes;

public class Seller extends Account
{
    public Seller(String fullName, String userName, String passWord, String creditCardNumber, String ccvNumber) {
        super(fullName, userName, passWord, creditCardNumber, ccvNumber);
    }
    
    public Seller(Seller copySellerAccount) {
        super(copySellerAccount);
        
    }
    
    public boolean isAccountType() {
        return accountType;
    }
    
    private final boolean accountType = true;
    // Instance variable for an Inventory Object
}

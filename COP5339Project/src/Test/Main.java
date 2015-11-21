package Test;

import Shopzilla_Outlet_Classes.*;

public class Main 
{
    public static void main(String args[]) 
    {
        Buyer aBuyer = new Buyer("Sammy Sanis", "rodrj183", "Zakah123", "45231233578887", "332");
        aBuyer.getCart().add(new Product("Milk", "556", "Perishable", 2, 4.59, 10.00));
        aBuyer.getCart().add(new Product("Candy", "526", "Perishable", 2, 4.59, 10.00));
        System.out.println(aBuyer);
        
        Buyer aSecondBuyer = new Buyer(aBuyer);
        System.out.println(aBuyer.equals(aSecondBuyer));
    }
}

package Kitten_Creation_Classes;

import Kitten_Creation_Interfaces.DataBaseWrapper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * A class that represents a DataBase that holds user Accounts,
 * the class implements the serializable interface, and the DataBaseWrapper
 * interfaces
 * @author Joshua
 */
public class AccountDataBase implements DataBaseWrapper, Serializable
{   
    /**
     * Constructs an AccountDataBase object
     */
    private AccountDataBase() {
        theDataBase = new TreeMap<>();
    }
    
    /**
     * Inserts Account objects and its derivatives into the database
     * @param data a Account object to insert into database
     */
    @Override
    public void insert(Account data) {
        if(data.getClass() == Buyer.class) {
            Buyer buyer = (Buyer)data;
            theDataBase.put(accountNumberID, new Buyer(buyer));
            accountNumberID++;
        }
        else if(data.getClass() == Seller.class) {
            Seller seller = (Seller)data;
            theDataBase.put(accountNumberID, new Seller(seller));
            accountNumberID++;
        }
    }

    /**
     * Removes an account from the database
     * @param userName a String representing the user name of the account to remove
     */
    @Override
    public void remove(String userName) {
        for(Map.Entry<Integer, Account> entry : theDataBase.entrySet()) {
            if(entry.getValue().getUserName().equals(userName)) {
                theDataBase.remove(entry.getKey());
                break;
            }
        }
    }

    /**
     * Searches for an account in the database
     * @param userName a String representing the user name of the account to search for
     * @return if the account is found or not, true or false respectively
     */
    @Override
    public boolean search(String userName) {
        boolean nameFound = false;
        for(Account account : theDataBase.values()) {
            if(account.getUserName().equals(userName)) {
              nameFound = true;
              break;
            }
        }
        
        return nameFound;
    }
    
    /**
     * Retrieves an account from the database
     * @param userName a String representing the user name of the account to retrieve from the database
     * @return the account specified by user name
     */
    @Override
    public Account retrieve(String userName) {
        Account retrievedAccount = null;
        for(Account account : theDataBase.values()) {
            if(account.getUserName().equals(userName)) {
              retrievedAccount = account;
            }
        }
        
        return retrievedAccount;
    }
    
    /**
     * Retrieves all the Seller account objects from the DataBase
     * @return returns an ArrayList of all Sellers within the AccountDataBase
     */
    public ArrayList<Seller> getAllSellers() {
        Seller seller = null; 
        ArrayList<Seller> sellerList = new ArrayList<>();
        
        for(Account account : theDataBase.values()) {
            if(account.getClass() == Seller.class) {
                sellerList.add((Seller)account);
            }
        }
        
        return sellerList;
    }
    
    /**
     * Retrieves all the Buyer account objects from the DataBase
     * @return returns an ArrayList of all Sellers within the AccountDataBase
     */
    public ArrayList<Buyer> getAllBuyers() {
        Buyer buyer = null;
        ArrayList<Buyer> buyerList = new ArrayList<>();
        
        for(Account account : theDataBase.values()) {
            if(account.getClass() == Buyer.class) { 
                buyerList.add((Buyer)account);
            }
        }
        
        return buyerList;
    }
    
    /**
     * Returns a reference to the AccountDataBase object
     * @return a reference to the AccountDataBase 
     */
    public static AccountDataBase getInstance() {
        return instance;
    }
    
    /**
     * Returns the current size of the database
     * @return an integer value specifying database size
     */
    @Override
    public int size() {
        return theDataBase.size();
    }
    
    private final TreeMap <Integer, Account> theDataBase;
    private int accountNumberID = 0;
    private static final AccountDataBase instance = new AccountDataBase(); 

}

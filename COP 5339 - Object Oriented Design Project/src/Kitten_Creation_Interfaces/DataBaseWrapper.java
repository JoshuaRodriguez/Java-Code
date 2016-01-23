package Kitten_Creation_Interfaces;

import Kitten_Creation_Classes.Account;

/**
 * An interface that "wraps" around an implementation of a DataBase
 * This interface is specific to DataBases that use the Account class
 * @author Joshua
 */
public interface DataBaseWrapper
{
    public void insert(Account data);
    public void remove(String userName);
    public Account retrieve(String userName);
    public boolean search(String userName);
    public int size();
}

package Shopzilla_Outlet_Interfaces;

public interface DataBaseWrapper <E>
{
    public void insert(E data);
    public void remove(E dataToRemove);
    public boolean search(E dataToFind);
    public E retrieve(E dataToFind);
    public void update(E... args);
}

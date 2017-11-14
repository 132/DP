/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anfri
 */
public abstract class Subject
{
    private List<IObserver> observers = new ArrayList<IObserver>();
    
    public void addObserver(IObserver observer)
    {
        observers.add(observer);
    }
    
    public void removeObserver(IObserver observer)
    {
        observers.remove(observer);
    }
    
    public void removeObservers()
    {
        observers.clear();
    }
    
    protected void notifyObservers()
    {
        for (IObserver obs : observers)
            obs.notifyUpdate(this);
    }
}

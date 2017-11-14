/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author anfri
 */
public class Chef implements IObserver
{    
    @Override
    public void notifyUpdate(Subject subj)
    {
        Order ord = (Order) subj;
        
        System.out.println("Chef: order #" + ord.getOrderNumber() + " received. Content of this order:");
        for (MenuItem item : ord.getItems())
            System.out.println("\t" + item.getName());
        System.out.println("Preparation started.");
    }
}

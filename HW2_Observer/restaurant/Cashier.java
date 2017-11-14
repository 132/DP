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
public class Cashier implements IObserver
{
    @Override
    public void notifyUpdate(Subject subj)
    {
        Order ord = (Order) subj;
        
        System.out.println("Cashier: order #" + ord.getOrderNumber() + " received. Content of this order:");
        for (MenuItem item : ord.getItems())
            System.out.println("\t" + item.getName() + " (€ " + item.getPrice() + ")");
        System.out.println("Total amount: €" + ord.getTotalAmount());
    }
}
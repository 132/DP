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
public class Order extends Subject
{
    private static int ordersCounter = 0;
    private int orderNumber;
    private List<MenuItem> items = new ArrayList<MenuItem>();
    private double totalAmount = 0;
    private boolean finalized;
    
    public Order()
    {
        orderNumber = ordersCounter;
        ordersCounter++;
    }
    
    public void addItem(MenuItem item)
    {
        if (finalized)
            return;
        
        items.add(item);
        totalAmount += item.getPrice();
    }
    
    public int getOrderNumber()
    {
        return orderNumber;
    }
    
    public List<MenuItem> getItems()
    {
        return items;
    }
    
    public double getTotalAmount()
    {
        return totalAmount;
    }
    
    public void placeOrder()
    {
        finalized = true;
        notifyObservers();
        removeObservers();
    }
}
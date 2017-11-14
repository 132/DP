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
public class MenuItem
{
    private String itemName;
    private double itemPrice;
    
    public MenuItem(String name, double price)
    {
        itemName = name;
        itemPrice = price;
    }
    
    public String getName()
    {
        return itemName;
    }
    
    public double getPrice()
    {
        return itemPrice;
    }
}
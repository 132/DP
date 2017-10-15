/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacap;

/**
 *
 * @author anfri
 */
public class Program 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PizzaCap pizzaStore = new PizzaCap();
        
        IDiscount strategy = new HappyHourDiscount(19, 20);
        pizzaStore.setDiscountStrategy(strategy);
        
        pizzaStore.sellPizza();
    }
}

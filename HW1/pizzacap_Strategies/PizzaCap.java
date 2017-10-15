/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacap;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author anfri
 */
public class PizzaCap 
{
    private IDiscount discountStrategy;
    private Random random;
    
    public PizzaCap()
    {
        discountStrategy = new NoDiscountAtAll();
        random = new Random();
    }
    
    public void setDiscountStrategy(IDiscount strategy)
    {
        discountStrategy = strategy;
    }
    
    public void sellPizza()
    {
        double price = random.nextDouble() * 4 + 4;
        double discount = discountStrategy.getDiscount(price);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Total: " + df.format(price));
        System.out.println("Discount: " + df.format(discount));
        System.out.println("Total after discount: " + df.format((price - discount)));
        System.out.println("Thanks for your purchase.");
    }
}
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
public class PercentageDiscount implements IDiscount
{
    int discountPercentage;
    
    public PercentageDiscount(int percentage)
    {
        if (percentage < 0 || percentage > 100)
            throw new IllegalArgumentException("Percentage must be between 0 and 100.");
        discountPercentage = percentage;
    }
    
    @Override
    public double getDiscount(double price)
    {
        return price * ((100 - discountPercentage) / 100);
    }
}
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
public class NoDiscountAtAll implements IDiscount
{
    @Override
    public double getDiscount(double price)
    {
        return 0;
    }
}

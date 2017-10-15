/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacap;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author anfri
 */
public class HappyHourDiscount implements IDiscount
{
    int beginning;
    int end;
    
    public HappyHourDiscount(int startingHour, int endingHour)
    {
        beginning = startingHour;
        end = endingHour;
    }
    
    @Override
    public double getDiscount(double price)
    {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hour >= beginning && hour <= end)
            return price - 2;
        else
            return 0;
    }
}

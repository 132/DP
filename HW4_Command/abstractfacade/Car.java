/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfacade;

/**
 *
 * @author anfri
 */
public class Car extends Vehicle
{
    private Seatbelt seatbelt;

    public void setSeatbelt(Seatbelt seatbelt)
    {
        this.seatbelt = seatbelt;
    }
    
    public void buckleSeatbelt()
    {
        seatbelt.buckle();
    }
    
    public void unbuckleSeatbelt()
    {
        seatbelt.unbuckle();
    }
}

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
public class Motorbike extends Vehicle
{
    private Helmet helmet;   
    
    public void setHelmet(Helmet helmet)
    {
        this.helmet = helmet;
    }
    
    public void wearHelmet()
    {
        helmet.wear();
    }
    
    public void takeOffHelmet()
    {
        helmet.takeOff();
    }
    
}
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
public abstract class Vehicle
{
    
    protected Engine engine;
    protected int fuelLevel;
    
    public Vehicle()
    {        
        this.fuelLevel = 100;
    }
    
    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }
    
    public void startEngine()
    {
        engine.on();
    }
    
    public void stopEngine()
    {
        engine.off();
    }
    
    public void driveTo(String location)
    {
        System.out.println("Heading to " + location + "...");        
        fuelLevel -= 80;
        System.out.println("Reached " + location + ".");
    }
    
    public int getFuelLevel()
    {
        return fuelLevel;
    }
    
    public void refuel(int percentage)
    {
        System.out.println("Refuelling...");
        fuelLevel += percentage;        
    }
    
    public void uTurn()
    {
        System.out.println("Performing a U-turn...");
    }  
}
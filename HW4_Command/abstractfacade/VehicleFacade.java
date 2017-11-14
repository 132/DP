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
public abstract class VehicleFacade
{
    
    Vehicle vehicle;
    
    public VehicleFacade(Vehicle vehicle)
    {        
        this.vehicle = vehicle;
    }
    
    public void hitTheRoad(String location)
    {        
        if (vehicle.getFuelLevel() < 30)
            vehicle.refuel(100 - vehicle.getFuelLevel());
        
        vehicle.startEngine();
        vehicle.driveTo(location);
    }
    
    public void comeBack()
    {       
        vehicle.uTurn();
        vehicle.driveTo("Home");
        vehicle.stopEngine();
    }
}
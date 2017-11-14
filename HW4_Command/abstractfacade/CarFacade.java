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
public class CarFacade extends VehicleFacade
{
    private Car car;
    
    public CarFacade(Car car, Engine engine, Seatbelt seatbelt)
    {
        super(car);
        this.car = car;
        this.car.setEngine(engine);
        this.car.setSeatbelt(seatbelt);
    }
    
    @Override
    public void hitTheRoad(String location)
    {
        car.buckleSeatbelt();
        super.hitTheRoad(location);
    }
    
    @Override
    public void comeBack()
    {
        super.comeBack();
        car.unbuckleSeatbelt();
    }
}

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
public class AbstractFacadeTest
{

    public static void main(String[] args)
    {
        
        Car car = new Car();
        Engine carEngine = new Engine();
        Seatbelt seatbelt = new Seatbelt();        
        
        VehicleFacade carFacade = new CarFacade(car, carEngine, seatbelt);
        
        Motorbike motorbike = new Motorbike();
        Engine motorbikeEngine = new Engine();
        Helmet helmet = new Helmet();
        
        VehicleFacade motorbikeFacade = new MotorbikeFacade(motorbike, motorbikeEngine, helmet);
        
        carFacade.hitTheRoad("Lisbon");
        carFacade.comeBack();
        
        carFacade.hitTheRoad("Berlin");        
        carFacade.comeBack();
        
        System.out.println("\n ------------------------------------------- \n");
        
        motorbikeFacade.hitTheRoad("Hanoi");
        motorbikeFacade.comeBack();
        
        motorbikeFacade.hitTheRoad("Turin");
        motorbikeFacade.comeBack();
    }    
}
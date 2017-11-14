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
public class MotorbikeFacade extends VehicleFacade
{
    private Motorbike motorbike;
    
    public MotorbikeFacade(Motorbike motorbike, Engine engine, Helmet helmet)
    {
        super(motorbike);
        this.motorbike = motorbike;
        this.motorbike.setEngine(engine);
        this.motorbike.setHelmet(helmet);
    }
    
    @Override
    public void hitTheRoad(String location)
    {
        motorbike.wearHelmet();        
        super.hitTheRoad(location);        
    }
    
    @Override
    public void comeBack()
    {
        super.comeBack();
        motorbike.takeOffHelmet();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapteruglyduckling;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anfri
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Adapters with Strategy
        
        Client duckClient = new Client();
        
        duckClient.interactWithDuck();
        
        ISwan uglyDuckling = new UglyDuckling();
        IDuck swanAdapter = new SwanAdapter(uglyDuckling);
        duckClient.setDuck(swanAdapter);
        duckClient.interactWithDuck();
        
        ITurkey turkey = new Turkey();
        IDuck turkeyAdapter = new TurkeyAdapter(turkey);
        duckClient.setDuck(turkeyAdapter);
        duckClient.interactWithDuck();
        
        // ---------------------------------------------------------------------
        
        // Adapters with Facade
        
        List<IDuck> adapters = new ArrayList<IDuck>();
        adapters.add(swanAdapter);
        adapters.add(turkeyAdapter);
        
        DuckFacade duckFacade = new DuckFacade(adapters);
        duckFacade.displayDucks();
        duckFacade.letDucksSwim();
    }
}
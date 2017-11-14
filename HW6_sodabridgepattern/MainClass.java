/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodabridgepattern;

import sodabridgepattern.abstractions.RegularSoda;
import sodabridgepattern.abstractions.Soda;
import sodabridgepattern.abstractions.SuperSizeSoda;
import sodabridgepattern.implementations.ColaImplementor;
import sodabridgepattern.implementations.GingerAleImplementor;
import sodabridgepattern.implementations.ISodaImplementor;

/**
 *
 * @author anfri
 */
public class MainClass
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        ISodaImplementor colaImplementor = new ColaImplementor();
        Soda cola = new RegularSoda(colaImplementor);
        
        ISodaImplementor gingerAleImplementor = new GingerAleImplementor();
        Soda gingerAle = new SuperSizeSoda(gingerAleImplementor);
        
        cola.pourSoda();
        gingerAle.pourSoda();
    }
    
}

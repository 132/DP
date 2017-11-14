/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodabridgepattern.abstractions;

import sodabridgepattern.implementations.ISodaImplementor;

/**
 *
 * @author anfri
 */
public class RegularSoda extends Soda
{
    
    public RegularSoda(ISodaImplementor implementor)
    {
        super(implementor);
    }

    @Override
    public void pourSoda()
    {
        implementor.pourSodaImplementation();
    }
    
}

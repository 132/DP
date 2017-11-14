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
public abstract class Soda
{
    protected ISodaImplementor implementor;
    
    public Soda(ISodaImplementor implementor)
    {
        this.implementor = implementor;                
    }
    
    public abstract void pourSoda();
}

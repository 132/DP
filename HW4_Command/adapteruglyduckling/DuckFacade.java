/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapteruglyduckling;

import java.util.List;

/**
 *
 * @author anfri
 */
public class DuckFacade
{

    List<IDuck> adapters;

    public DuckFacade(List<IDuck> adapters)
    {
        this.adapters = adapters;
    }

    public void displayDucks()
    {
        for (IDuck adapter : adapters)
            adapter.display();
    }

    public void letDucksSwim()
    {
        for (IDuck adapter : adapters)
            adapter.swim();
    }
}
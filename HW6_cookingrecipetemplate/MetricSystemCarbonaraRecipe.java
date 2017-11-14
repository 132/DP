/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookingrecipetemplate;

/**
 *
 * @author anfri
 */
public class MetricSystemCarbonaraRecipe extends CarbonaraRecipe
{

    @Override
    protected void pourWater()
    {
        System.out.println("Pouring 4l of water...");
    }

    @Override
    protected void addPasta()
    {
        System.out.println("Adding 150g of pasta...");
    }

    @Override
    protected void addBacon()
    {
        System.out.println("Adding 50g of bacon...");
    }

    @Override
    protected void addCheese()
    {
        System.out.println("Adding 100g of cheese...");
    }
    
}

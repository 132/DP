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
public class EnglishSystemCarbonaraRecipe extends CarbonaraRecipe
{

    @Override
    protected void pourWater()
    {
        System.out.println("Pouring 1 gal of water...");
    }

    @Override
    protected void addPasta()
    {
        System.out.println("Adding 6 oz of pasta...");
    }

    @Override
    protected void addBacon()
    {
        System.out.println("Adding 2 oz of bacon...");
    }

    @Override
    protected void addCheese()
    {
        System.out.println("Adding 4 oz of cheese...");
    }
    
}

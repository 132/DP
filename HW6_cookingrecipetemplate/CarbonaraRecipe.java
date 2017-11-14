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
public abstract class CarbonaraRecipe
{

    public final void prepare()
    {
        pourWater();
        boilWater();
        addPasta();
        cookPasta();
        addBacon();
        cookBacon();
        addEggs();
        addCheese();
        addPepper();
        mix();
        serve();
    }

    protected abstract void pourWater();

    protected void boilWater()
    {
        System.out.println("Boiling water...");
    }

    protected abstract void addPasta();

    protected void cookPasta()
    {
        System.out.println("Cooking pasta...");
    }

    protected abstract void addBacon();

    protected void cookBacon()
    {
        System.out.println("Cooking bacon...");
    }

    protected void addEggs()
    {
        System.out.println("Adding eggs...");
    }

    protected abstract void addCheese();

    protected void addPepper()
    {
        System.out.println("Adding pepper...");
    }

    protected void mix()
    {
        System.out.println("Mixing up everything...");
    }

    protected void serve()
    {
        System.out.println("Carbonara is ready.");
    }
}

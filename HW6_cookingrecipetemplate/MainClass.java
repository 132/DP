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
public class MainClass
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        CarbonaraRecipe msCarbonara = new MetricSystemCarbonaraRecipe();
        CarbonaraRecipe engCarbonara = new EnglishSystemCarbonaraRecipe();
        
        msCarbonara.prepare();
        engCarbonara.prepare();
    }
    
}

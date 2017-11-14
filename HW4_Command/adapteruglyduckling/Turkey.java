
package adapteruglyduckling;

public class Turkey implements ITurkey
{

    @Override
    public void display()
    {
        System.out.println("Turkey display");
    }

    @Override
    public void act()
    {
        System.out.println("Turkey act");
    }
}
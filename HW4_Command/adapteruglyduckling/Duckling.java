
package adapteruglyduckling;

public class Duckling implements IDuck
{

    @Override
    public void display()
    {
        System.out.println("Duckling display");
    }

    @Override
    public void swim()
    {
        System.out.println("Duckling swim");
    }
}
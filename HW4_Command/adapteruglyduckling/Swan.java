
package adapteruglyduckling;

public class Swan implements ISwan
{

    @Override
    public void show()
    {
        System.out.println("Swan show");
    }

    @Override
    public void swim()
    {
        System.out.println("Swan swim");
    }
}

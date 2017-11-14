
package adapteruglyduckling;

public class SwanAdapter implements IDuck
{

    ISwan swan;

    public SwanAdapter(ISwan s)
    {
        this.swan = s;
    }

    @Override
    public void display()
    {
        swan.show();
    }

    @Override
    public void swim()
    {
        swan.swim();
    }

}

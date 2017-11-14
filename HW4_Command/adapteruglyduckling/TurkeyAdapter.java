
package adapteruglyduckling;

public class TurkeyAdapter implements IDuck
{

    ITurkey turkey;

    public TurkeyAdapter(ITurkey t)
    {
        this.turkey = t;
    }

    @Override
    public void display()
    {
        turkey.display();
    }

    @Override
    public void swim()
    {
        turkey.act();
    }

}

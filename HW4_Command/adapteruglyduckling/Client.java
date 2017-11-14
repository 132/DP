
package adapteruglyduckling;

public class Client
{
    IDuck duck;
    
    public Client()
    {
        this.duck = new Duckling();
    }
    
    public void interactWithDuck()
    {
        duck.display();       
        duck.swim();
    }
    
    public void setDuck(IDuck duck)
    {
        this.duck = duck;
    }
}
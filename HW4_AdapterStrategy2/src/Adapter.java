// Adapter
public class Adapter implements IDuck{
	IAdapter TypeOfDuck;
	
	public void setType(IAdapter t) {
		TypeOfDuck = t;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		TypeOfDuck.display();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		TypeOfDuck.act();
	}

}

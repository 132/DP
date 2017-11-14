
public class TurkeyAdapter implements IDuck{
	ITurkey turkey;
	public TurkeyAdapter(ITurkey t) {
		this.turkey = t;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		turkey.display();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		turkey.act();
	}
	
}

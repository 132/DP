
public class TurkeyAdapter implements IAdapter{
	
	Turkey turkey;
	public TurkeyAdapter(Turkey s) {
		this.turkey = s;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		turkey.display();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		turkey.act();
	}


}

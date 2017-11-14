// Adapter
public class Adapter implements IDuck{
	IStrategy strategy;
	
	public Adapter() {
		this.strategy = new Swan();
	}
	public Adapter(IStrategy s) {
		this.strategy = s;
	}
	
	public void setStrategy(IStrategy s) {
		this.strategy = s;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		strategy.display();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		strategy.act();
	}

}

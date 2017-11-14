
public class SwanAdapter implements IAdapter{
	
	Swan swan;
	public SwanAdapter(Swan s) {
		this.swan = s;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		swan.show();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		swan.swim();
	}
	

}

// Adapter
public class SwanAdapter implements IDuck{
	ISwan swan;
	public SwanAdapter(ISwan s) {
		this.swan = s;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		swan.show();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		swan.swim();
	}

}

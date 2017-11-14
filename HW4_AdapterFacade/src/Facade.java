
public class Facade implements IDuck{
	ISwan swan;
	ITurkey turkey;
	//IDuck duck;

	public Facade(ISwan s, ITurkey t){
		this.swan = s;
		this.turkey = t;
	}
	
	public void displayTurkey() {
		turkey.display();
	}
	public void showSwan() {
		swan.show();
	}
	
	public void swimSwan() {
		swan.swim();		
	}
	public void actTurkey() {
		turkey.act();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		swan.show();
		turkey.display();		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		swan.swim();
		turkey.act();
	}
}

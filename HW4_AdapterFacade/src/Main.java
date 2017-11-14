
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISwan swan= new Swan();
		ITurkey turkey = new Turkey();
		
		IDuck test = new Facade(swan,turkey);
		
		test.display();
		test.swim();
	}

}

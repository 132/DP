
public class Main {

	public static void main(String[] args) {
		IDuck test = new Adapter();
		Swan swan = new Swan();
		IAdapter SwanAdapter = new SwanAdapter(swan);
		
		test.setType(SwanAdapter);
		
	}

}

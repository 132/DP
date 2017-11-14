
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStrategy ISswan = new Swan();
		IDuck test = new Adapter();
	//	test.setStrategy(ISswan);
		
		test.display();
		test.swim();
		
		IStrategy abc1 = new Turkey();
		
		IDuck test1 = new Adapter(abc1);
		//IDuck test1 = new Adapter();
		
		test1.display();
		test1.swim();
	}

}

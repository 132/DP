
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryPhilips FP = new FactoryPhilips();
		ElectronicStore_Client test = new ElectronicStore_Client(FP);
		test.askProducts();
	}

}

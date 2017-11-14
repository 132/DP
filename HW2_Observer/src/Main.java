import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waiter w = new Waiter();
		Order od = new Order();
		w.createOrder(od);
		
		ObserverCashier cashi = new ObserverCashier(od);
		ObserverKitchen kitch = new ObserverKitchen(od);
		od.addObser(cashi);
		od.addObser(kitch);
		boolean cont = true;
		while(cont) {
			System.out.println("Which item do you want to add? ");
			Scanner s = new Scanner(System.in);
			//char c = s.findInLine(".").charAt(0);
			String c = s.next();
			
		//	w.addItem(od, "Hamburger");
		//	w.addItem(od, "Soda");
			w.addItem(od, c);
			
			ArrayList<String> items = od.getNameOfItems();
			for(String i : items)
				System.out.println(" " + i + " ");
			System.out.println("Cont? ");
			s = new Scanner(System.in);
			c = s.next();
			if(c.equals("No"))
				cont = false;
		}
	}

}

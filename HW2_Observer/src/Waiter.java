import java.util.ArrayList;

/*
 * Mediator or controller
 */
// send notify to Order & Observer
public class Waiter{
	private ArrayList<Order> Od = new ArrayList<>();
	
	public void createOrder() {
		Order newOd = new Order();
		Od.add(newOd);
	}
	public void createOrder(Order newOd) {
		Od.add(newOd);
	}
	public void removeOrder(Order e) {
		Od.remove(e);
	}
	public void addItem(Order o, String in) {
		System.out.println("add Item from Waier");
		Od.get(Od.indexOf(o)).addItem(in);
	}
	public void removeItem(Order o, String in) {
		Od.get(Od.indexOf(o)).removeItem(in);
	}
	public void changeItem(Order o, String oldItem, String newItem) {
		
	}
}

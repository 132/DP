import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
/*
 * 	Model storing order
 */
public class Order {
	protected static final Hashtable<String,Double> Menu = new Hashtable<String,Double>() {{
	    put("Hamburger",      3.99);
	    put("Chesseburger",   4.99);
	    put("Milk_Shake",     5.00);
	    put("Soda", 		  2.00);
	    put("Fries",   		  2.50);
	 }};
	 private ArrayList<Entry<String, Double>> ItemList = new ArrayList<Entry<String, Double>>();
	 protected DeleObserver DeleOb;
	 private double totalPrice;
	 private ArrayList<myObservable> ObsList = new ArrayList<>();
	 protected boolean stateChange;
	 
	 public Order() {
		 totalPrice = 0;
		 DeleOb = new DeleObserver();
	 }
	 
	 public void addItem(String in) {
		 System.out.println("add Item from Order");
		 Double priceOfnew = Menu.get(in).doubleValue();
		 
		 ItemList.add(new AbstractMap.SimpleEntry<String,Double>(in,priceOfnew));
		 // update
		 DeleOb.setChanged();
		 stateChange = DeleOb.hasChanged();
	//	 DeleOb.notifyObservers(in);
	//	 DeleOb.notifyObservers(priceOfnew);
		 
		 // pull
	//	 stateChange = DeleOb.hasChanged();
	 }
	 public void removeItem(String in) {
		 Double priceOfnew = Menu.get(in).doubleValue();
		 Entry<String, Double> temp = new AbstractMap.SimpleEntry<String,Double>(in,priceOfnew);
		 if(ItemList.contains(temp)) {
			 ItemList.remove(temp);
			 // send notify to Observer
			 DeleOb.setChanged();
			 stateChange = DeleOb.hasChanged();
	//		 DeleOb.notifyObservers(in);
	//		 DeleOb.notifyObservers(priceOfnew);
			 // pull change the state of
	//		 stateChange = DeleOb.hasChanged();
		 }
		 else
			 System.out.println("Not existing this item!!!");
	 }
	 
	 
	 
	 public double getTotalPrice() {
		 for(int i=0; i<ItemList.size();i++)
			 totalPrice += ItemList.get(i).getValue();

		 return totalPrice;
	 }
	 public ArrayList<String> getNameOfItems() {
		 ArrayList<String> out = new ArrayList<>();
		 
		 for(int i=0; i<ItemList.size();i++)
			 out.add(ItemList.get(i).getKey());
		 
		 return out;
	 }
	 
	 public void addObser(Observer o) {
		 //DeleOb.addObserver(o);
		 DeleOb.addObserver(o);
	 }
	 public void deleteObser(Observer o) {
		 //DeleOb.deleteObserver(o);
		 DeleOb.deleteObserver(o);
	 }
}

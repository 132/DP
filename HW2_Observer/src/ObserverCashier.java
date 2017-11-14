import java.util.Timer;
import java.util.TimerTask;

public class ObserverCashier implements Observer {
	
	private double PriceOfItem;
	private Order subject;
	
	public ObserverCashier(Order o) {
		// TODO Auto-generated constructor stub
		PriceOfItem = 0;
		subject = o;
		System.out.println("Cashier Observer: Price is " + PriceOfItem);
		checkState();
	}
	@Override
	public void update(Object obj, Object arg) {
		// TODO Auto-generated method stub
		if(arg instanceof Double) {
			PriceOfItem = ((Double)arg).doubleValue();
			System.out.println("Cashier Observer: Price is changed to " + PriceOfItem);
		}else {
			System.out.println("Cashier Observer: Other change ");
		}
	}

	@Override
	public void checkState() {
		// TODO Auto-generated method stub
		
		int MINUTES = 1; // The delay in minutes
		Timer timer = new Timer();
		 timer.schedule(new TimerTask() {
		    @Override
		    public void run() { // Function runs every MINUTES minutes.
		        // Run the code you want here
		    	
		    	System.out.println("Start Checking in Cashier ....");
				System.out.println(subject.stateChange + " Cashise check");
				
		        if(subject.stateChange) { // If the function you wanted was static
		        	
		        	update(subject, subject.getTotalPrice());
		        	subject.stateChange = subject.DeleOb.clearChanged();
		        	System.out.println(subject.stateChange + " clear Cashise check");
		        }
		    }
		 }, 0, 1000 * 60 * MINUTES);
		    // 1000 milliseconds in a second * 60 per minute * the MINUTES variable. 
	}


}

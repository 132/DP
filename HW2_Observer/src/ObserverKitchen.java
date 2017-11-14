import java.util.ArrayList;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

public class ObserverKitchen implements Observer{
	private ArrayList<String> name;
	protected Order subject;
	
	public ObserverKitchen(Order o) {
		// TODO Auto-generated constructor stub
		name = null;
		subject = o;
		System.out.println("Kitchen Observer: Name of Item: " + name);
		checkState();
	}
	@Override
	public void update(Object o, Object arg) {
		// TODO Auto-generated method stub
		name = (ArrayList<String>) arg;
	//	if() {
			
			for(String i : name)
				System.out.println("Kitchen Observer: name is changed to " + i + " ");
	//	}else {
	//		System.out.println("Kitchen Observer: Other change ");
	//	}
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
		    	System.out.println("Start Checking in Kitchen ....");
				System.out.println(subject.stateChange + " Kitchen check");
		        if(subject.stateChange) { // If the function you wanted was static
		        	update(subject, subject.getNameOfItems());
		        	subject.stateChange = subject.DeleOb.clearChanged();
		        	System.out.println(subject.stateChange + " clear Kitchen check");
		        }
		    }
		 }, 0, 1000* 60 *MINUTES);// * 60 * MINUTES);
		    // 1000 milliseconds in a second * 60 per minute * the MINUTES variable. 
	}



}

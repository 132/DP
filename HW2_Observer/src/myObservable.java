import java.util.ArrayList;

public class myObservable {
	private ArrayList<Observer> ObList = new ArrayList<>();
	private boolean stateChange = false;
	
	protected void setChanged() {
		System.out.println("set changed");
		stateChange = true;
	}
	protected boolean clearChanged() {
		stateChange = false;
		return false;
	}	
	protected boolean hasChanged() {
		return stateChange;
	}
	public void notifyObservers(Object arg) {
		
	}
	public void notifyObservers() {
		
	}
	public void addObserver(Observer o) {
		ObList.add(o);
		
	}
	public void deleteObserver(Observer o) {
		ObList.remove(o);
	}
	public void deleteAllObserver() {
		ObList.clear();
	}
	public int countObserver(Observer o) {
		return ObList.size();
	}
	
	
}


import java.util.ArrayList;

public abstract class AbstractSortingClass{
	
	ArrayList<Integer> integerList = new ArrayList<>();
	
	final void sort(ArrayList<Integer> in) {
		getInput(in);
		bubbleSort();
		getResult();
		hook();
	}
	
	public void bubbleSort() {
		boolean totalSwap = false;
		do {
			totalSwap = false;
			for(int i=0;i<integerList.size()-1;i++)
				if(compareTo(integerList.get(i), integerList.get(i+1))) {
					swap(integerList, i);
					totalSwap = true;
					
				}
		} while(totalSwap != false);
	}
	
	public void getInput(ArrayList<Integer> in) {
		this.integerList = in;
	}
	
	public void getResult(){
		for(Integer e : integerList)
			System.out.println(e);
	}
	
	public void swap(ArrayList<Integer> inList, int position) {
		int temp = inList.get(position);
		inList.set(position, inList.get(position+1));
		inList.set(position + 1, temp);
	}
	
	// hook function does nothing
	public void hook() {
		
	}

	public abstract boolean compareTo(Integer a, Integer b);

}

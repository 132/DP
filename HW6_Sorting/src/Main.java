import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		
		myList.add(3);
		myList.add(6);
		myList.add(1);
		myList.add(2);
		myList.add(7);
		myList.add(8);
		myList.add(0);
		myList.add(9);
		myList.add(16);
		myList.add(5);
		myList.add(4);	
		
		AbstractSortingClass ascenSorting = new ConcreteAscendingSortingClass();
		ascenSorting.sort(myList);
		
		System.out.println("=======================================================");
		AbstractSortingClass descenSorting = new ConcreteDescendingSortingClass();
		descenSorting.sort(myList);

	}

}

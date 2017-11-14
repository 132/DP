
public class ConcreteDescendingSortingClass extends AbstractSortingClass{

	@Override
	public boolean compareTo(Integer a, Integer b) {
		return (b > a) ? true : false;
	}
	

}

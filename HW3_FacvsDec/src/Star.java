
public class Star extends Decorator{

	Tree Od;
	public Star(Tree in) {
		Od = in;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return Od.getDescription() + "Star, ";
	}

	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return 10 + Od.Cost();
	}
}

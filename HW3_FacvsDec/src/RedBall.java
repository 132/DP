
public class RedBall extends Decorator{
	Tree Od;
	public RedBall(Tree in) {
		Od = in;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return Od.getDescription() + "Red Ball, ";
	}

	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return 1 + Od.Cost();
	}



}

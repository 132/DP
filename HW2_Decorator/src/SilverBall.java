
public class SilverBall extends DecoratorClass{
	OrderList Od;
	public SilverBall(OrderList in) {
		// TODO Auto-generated constructor stub
		Od = in;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return Od.getDescription() + "Silver Ball, ";
	}

	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return 3 + Od.Cost();
	}



}

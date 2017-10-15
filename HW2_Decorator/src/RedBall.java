
public class RedBall extends DecoratorClass {
	OrderList Od;
	public RedBall(OrderList in) {
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

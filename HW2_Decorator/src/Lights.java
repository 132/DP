
public class Lights extends DecoratorClass{
	OrderList Od;
	public Lights(OrderList in) {
		Od = in;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return Od.getDescription() + "Light, ";
	}
	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return 5 + Od.Cost();
	}
	
}

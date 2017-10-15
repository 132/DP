
public class Star extends DecoratorClass{
	private OrderList Od;
	private boolean hasStar = false; 
	public Star(OrderList in) {
		if(in.getDescription().contains("Star")) {
			hasStar = true;
			System.out.println("Exsisting star");
		}else {
			System.out.println("Not exsisting star");
		}
		Od = in;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(!hasStar)
			return Od.getDescription()+"Star, ";
		else
			return Od.getDescription();
	}
	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		if(!hasStar)
			return 4 + Od.Cost();
		else
			return Od.Cost();
	}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderList Tree = new Fraser_Fir();
		
		OrderList Star = new Star(Tree);
		OrderList RedBall = new RedBall(Star);
		
		OrderList DStars = new Star(RedBall);
		System.out.println(DStars.Cost());
		System.out.println(DStars.getDescription());
		
		
	}

}

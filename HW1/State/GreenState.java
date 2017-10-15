public class GreenState implements handlePullBeha,handlePushBeha{
    public void handlePush(Context c){
        c.setState(new BlackState());
    }
    public void handlePull(Context c){
        c.setState(new BlueState());
    }
 //   public Color getColor(){
 //       return (Color.Black);
 //   }
}

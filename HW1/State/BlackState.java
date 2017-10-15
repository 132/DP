public class BlackState implements handlePullBeha,handlePushBeha{
    public void handlePush(Context c){
        c.setState(new RedState());
    }
    public void handlePull(Context c){
        c.setState(new GreenState());
    }
 //   public Color getColor(){
 //       return (Color.Black);
 //   }
}

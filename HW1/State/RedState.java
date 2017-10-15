public class RedState implements handlePullBeha,handlePushBeha{
    public void handlePush(Context c){
        c.setState(new BlueState());
    }
    public void handlePull(Context c){
        c.setState(new GreenState());
    }
 //   public Color getColor(){
 //       return (Color.Black);
 //   }
}

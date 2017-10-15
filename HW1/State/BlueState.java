public class BlueState implements handlePullBeha,handlePushBeha{
    public void handlePush(Context c){
        c.setState(new GreenState());
    }
    public void handlePull(Context c){
        c.setState(new RedState());
    }
}

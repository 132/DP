public abstract class State{
    Context cofState;
    handlePushBeha hPush;
    handlePullBeha hPull;
    public State(Context c){
        this.cofState = c;
    }
    public setPull(handlePullBeha _pull){
        hPull = _pull;
    }
      public setPush(handlePushBeha _push){
        hPush = _push;
    }
    public void transition(){
        hPush.handlePush(c);
        hPull.handlePull(c);
    }
}

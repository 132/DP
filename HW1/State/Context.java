public class Context{
    private State state = null;
    
    public Context(State state){
        this.state = state;
    }
    public Context(){
        this(new RedState());
    }
    public State getSate(){
        return state;
    }
    public void setState(State state){
        this.state = state;
    }
    public void push(){
        state.setPush(this);
    }
    public void pull(){
        state.setPull(this);
    }
}

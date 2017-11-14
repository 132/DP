public class AddRedBallsCommand extends Command
{
    private Decoration decoration;

    public AddRedBallsCommand(Tree t, BallsRed d)
    {
        super(t);
        decoration = d;
    }

    @Override
    public void perform()
    {
        t.addDecoration(decoration);
    }
}

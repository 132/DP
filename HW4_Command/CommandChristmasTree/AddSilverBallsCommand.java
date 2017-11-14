public class AddSilverBallsCommand extends Command
{
    private Decoration decoration;

    public AddSilverBallsCommand(Tree t, BallsSilver d)
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

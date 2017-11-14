public class AddLightsCommand extends Command
{
    private Decoration decoration;

    public AddLightsCommand(Tree t, Lights d)
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

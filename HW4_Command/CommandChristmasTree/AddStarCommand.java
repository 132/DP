public class AddStarCommand extends Command
{
    private Decoration decoration;

    public AddStarCommand(Tree t, Star d)
    {
        super(t);
        decoration = d;
    }

    @Override
    public void perform()
    {
        if(decoration.description.equals("star") && t.hasDecoration(decoration))
        {
            System.out.println("You can only put one star.");
            return;
        }
        t.addDecoration(decoration);
    }
}

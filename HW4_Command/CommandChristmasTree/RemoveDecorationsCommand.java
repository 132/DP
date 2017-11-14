import java.util.List;

public class RemoveDecorationsCommand extends Command
{
    Box box;
    public RemoveDecorationsCommand(Tree tree)
    {
        super(tree);
        box = new Box();
    }

    @Override
    public void perform()
    {
        List<Decoration> removedDecorations = t.clearDecorations();
        box.storeDecorations(removedDecorations);
    }
}

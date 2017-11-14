import java.util.ArrayList;
import java.util.List;

public class SimpleTreeCommand extends Command
{
    List<Command> commands;

    // Builds a Frasier fir with just a star and lights
    public SimpleTreeCommand(Tree t)
    {
        super(t);
        commands = new ArrayList<Command>();
        commands.add(new AddLightsCommand(t, new Lights()));
        commands.add(new AddStarCommand(t, new Star()));
    }

    @Override
    public void perform()
    {
        for (Command c: commands)
            c.perform();
    }
}

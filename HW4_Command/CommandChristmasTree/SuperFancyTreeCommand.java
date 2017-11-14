import java.util.ArrayList;
import java.util.List;

public class SuperFancyTreeCommand extends Command
{
    List<Command> commands;

    // Fills a Colorado blue tree with two copies of
    // all the decorations available, except for the
    // star.
    public SuperFancyTreeCommand(Tree t)
    {
        super(t);
        commands = new ArrayList<Command>();

        commands.add(new AddStarCommand(t, new Star()));

        commands.add(new AddLightsCommand(t, new Lights()));
        commands.add(new AddLightsCommand(t, new Lights()));

        commands.add(new AddRedBallsCommand(t, new BallsRed()));
        commands.add(new AddRedBallsCommand(t, new BallsRed()));

        commands.add(new AddSilverBallsCommand(t, new BallsSilver()));
        commands.add(new AddSilverBallsCommand(t, new BallsSilver()));
    }

    @Override
    public void perform()
    {
        for (Command c: commands)
            c.perform();
    }
}

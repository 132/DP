public class TreeDecorator
{
    // This class represents the invoker in the pattern structure
    private Tree t;

    public void printTreeDescription()
    {
        t.getCompleteDescription();
    }

    public int getTreeCost()
    {
        return t.getTotalCost();
    }

    public TreeDecorator(Tree tr)
    {
        t = tr;
    }

    public TreeDecorator() {  }

    public void SimpleTreeForLazyPeople()
    {
        t = new FraserFir();
        Command c = new SimpleTreeCommand(t);
        c.perform();
    }

    public void SuperFancyTreeForRichPeople()
    {
        t = new ColoradoBlue();
        Command c = new SuperFancyTreeCommand(t);
        c.perform();
    }

    public void AddStar(Star s)
    {
        Command c = new AddStarCommand(t, s);
        c.perform();
    }

    // Alternative way to invoke the command AddStarCommand
    public void BeautifyTree(Star s)
    {
        Command c = new AddStarCommand(t, s);
        c.perform();
    }

    public void AddRedBalls(BallsRed ballsRed)
    {
        Command c = new AddRedBallsCommand(t, ballsRed);
        c.perform();
    }

    public void AddSilverBalls(BallsSilver ballsSilver)
    {
        Command c = new AddSilverBallsCommand(t, ballsSilver);
        c.perform();
    }

    public void AddLights(Lights l)
    {
        Command c = new AddLightsCommand(t, l);
        c.perform();
    }

    public void UndecorateTree()
    {
        Command c = new RemoveDecorationsCommand(t);
        c.perform();
        System.out.println("Epiphany has come, tree is gone.");
    }
}

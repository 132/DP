public class Main
{
    public static void main(String[] args)
    {
        // Build a tree manually.
        Tree t = new FraserFir();
        TreeDecorator decorator = new TreeDecorator(t);
        decorator.AddLights(new Lights());
        decorator.AddRedBalls(new BallsRed());
        decorator.AddStar(new Star());
        decorator.printTreeDescription();
        System.out.println(decorator.getTreeCost());

        // ---------------------------------------------

        // No tree is specified here: everything is included
        // in the macro-command.
        TreeDecorator decorator2 = new TreeDecorator();
        decorator2.SuperFancyTreeForRichPeople();
        decorator2.printTreeDescription();
        System.out.println(decorator2.getTreeCost());

        // ----------------------------------------------

        decorator2.UndecorateTree();
    }
}

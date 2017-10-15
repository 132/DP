public abstract class Decoration extends Tree
{
    protected Tree tree;

    public String getDescription()
    {
        return tree.getDescription() + description;
    }

    public int getCost()
    {
        return tree.getCost() + cost;
    }

    // The "proper tree" classes, like ColoradoBlue and
    // FrasierFir, don't contain a method hasStar()
    // because they must not make any assumption on their
    // decorations.
    public boolean hasStar()
    {
        if(tree instanceof Decoration)
            return ((Decoration) tree).hasStar();
        else
            return false;
    }
}

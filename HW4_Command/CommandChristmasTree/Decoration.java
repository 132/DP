public abstract class Decoration
{
    protected String description;
    protected int cost;

    public String getDescription()
    {
        return description;
    }

    public int getCost()
    {
        return cost;
    }

    // Two decorations are the same if they have the same name.
    // This method will be used to check the presence of a star
    // decoration in the tree.
    @Override
    public boolean equals(Object o)
    {
        Decoration d = (Decoration) o;
        return description.equals(d.description);
    }
}

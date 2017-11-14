public abstract class Command
{
    protected Tree t;

    public Tree getTree()
    {
        return t;
    }

    protected Command() { }

    protected Command(Tree t)
    {
        this.t = t;
    }

    public abstract void perform();
}

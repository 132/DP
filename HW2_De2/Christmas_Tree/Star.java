public class Star extends Decoration
{
    public Star(Tree t)
    {
        tree = t;
        if(t instanceof Decoration && ((Decoration)t).hasStar())
        {
            cost = 0;
            description = "";
        }
        else
        {
            cost = 4;
            description = ", star";
        }
    }

    @Override
    public boolean hasStar()
    {
        System.out.println("We don't have money for another star!");
        return true;
    }
}

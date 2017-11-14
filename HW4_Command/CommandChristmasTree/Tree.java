import java.util.ArrayList;
import java.util.List;

public abstract class Tree
{
    // This class represents the receiver in the pattern structure
    private List<Decoration> decorations = new ArrayList<>();
    protected String description;
    protected int cost;

    public boolean hasDecoration(Decoration d)
    {
        return decorations.contains(d);
    }

    public void getCompleteDescription()
    {
        System.out.print(description + " ");

        for (Decoration d : decorations)
        {
            System.out.print(d.getDescription());
        }

        System.out.println();
    }

    public int getTotalCost()
    {
        int res = cost;
        for (Decoration d : decorations)
            res += d.getCost();
        return res;
    }

    public void addDecoration(Decoration d)
    {
        decorations.add(d);
    }

    public List<Decoration> clearDecorations()
    {
        List<Decoration> res = decorations;
        decorations = new ArrayList<>();
        return res;
    }
}

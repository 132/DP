public class Main
{
    public static void main(String args[])
    {
        Tree t = new ColoradoBlue();
        t = new BallsRed(t);
        t = new Star(t);
        t = new Lights(t);
        t = new Star(t);
        t = new Lights(t);
        t = new Star(t);

        System.out.println(t.getDescription());
        System.out.println("Total cost: € " + t.getCost());
    }
}

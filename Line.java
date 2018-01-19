public class Line
{
    private point p1;
    private point p2;

    public Line ()
    {
        p1 = new point(0,0);
        p2 = new point(0,0);
    }

    public Line (int a, int b, int x, int y)
    {
        p1 = new point(a,b);
        p2 = new point(x,y);
    }

    public String toString ()
    {
        return ("Point 1: (" + p1.getX() + "," + p1.getY() + ")" + "   Point 2: (" + p2.getX() + "," + p2.getY() + ")");
    }

    public double distance ()
    {
        return (double)(Math.sqrt(Math.pow((p2.getX()-p1.getX()), 2) + (Math.pow((p2.getY()-p1.getY()), 2))));
    }

    public double slope ()
    {
        return ((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));
    }
}
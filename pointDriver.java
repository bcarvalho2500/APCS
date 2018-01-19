
class point
{
    private int x;
    private int y;

    public pointClass ()
    {
        x = 0;
        y = 0;
    }

    public pointClass(int a, int b)
    {
        x = a;
        y = b;
    }

    public void setX (int a)
    {
        x = a;
    }

    public void setY (int b)
    {
        y = b;
    }

    public int getX ()
    {
        return x;
    }

    public int getY ()
    {
        return y;
    }

    public String toString ()
    {
        return ("The value of x = " + x + " and value of y = " + y);
    }
}
public class wheel
{
    private int diameter;

    public wheel (int a)
    {
        diameter = a;
    }

    public void setDiameter (int a)
    {
        diameter = a;
    }

    public int getDiameter ()
    {
        return diameter;
    }

    public String toString ()
    {
        return ("The diameter is " + diameter);
    }
}
public class car
{
    private String color;
    private wheel diameter;

    public car ()
    {
        color = "white";
        diameter = new wheel (0);
    }

    public car (String a, int x)
    {
        color = a;
        diameter = new wheel(x);
    }

    public void setColor (String c)
    {
        color = c;
    }

    public void setDiameter (int x)
    {
        diameter = new wheel(x);
    }

    public String getColor ()
    {
        return color;
    }

    public int getDiameter ()
    {
        return diameter.getDiameter();
    }

    public String toString ()
    {
        return ("The color of my car is " + color + " and the wheel diameter is " + car.this.getDiameter());
    }
 }
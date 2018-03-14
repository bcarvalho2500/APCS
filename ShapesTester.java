public class ShapesTester
{
    public static void main(String[] args) {

    }
}
/**
 * ShapesTester
 */

interface Sizeable {
    double volume();
    double surfaceArea();
}

class Sphere implements Sizeable {

    private int radius;

    public Sphere (int r)
    {
        radius = r;
    }

    public double volume ()
    {
        return ((4/3) * Math.PI * radius * radius * radius);
    }

    public double surfaceArea ()
    {
        return (4 * Math.PI * radius * radius);
    }
}

/**
 * Cylinder implements Sizeable
 */
public class Cylinder implements Sizeable {

    private int radius;
    private int height;

    public Cylinder (int r, int h)
    {
        radius = r;
        height = h;
    }

    public double volume ()
    {
        return (radius * radius * height * Math.PI);
    }

    public double surfaceArea ()
    {
        return ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
    }
}

/**
 * RectangularPrism
 */
class RectangularPrism implements Sizeable{

    private int length;
    private int width;
    private int height;

    public RectangularPrism (int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }
    public double volume ()
    {
        return (length * width * height);
    }

    public double 
}
public class birdDriver
{
    public static void main (String args[])
    {

    }
}

class bird
{
    protected String name;
    protected String noise;

    public bird (String bName, String bNoise)
    {
        name = bName;
        noise = bNoise;
    }

    public String getName()
    {
        return name;
    }

    public String speak()
    {
        return noise;
    }

    public String toString()
    {
        return name + " says " + noise;
    }
}

class Owl extends bird
{
    private String size;
    private String location;

    public Owl (String name, String s, String loc)
    {
        super(name, "hoot");
        size = s;
        location = loc;
    }

    public String speak()
    {
        return super.speak() + " " + super.speak() + " ";
    }

    public String getFood()
    {
        int ran = (int)(Math.random() * 3);
        if (ran == 0)
        {
            return "hare";
        }
        if (ran == 1)
        {
            return "lemming";
        }
        return "small bird";
    }

    public String toString()
    {
        return "The " + size + " " + super.toString() + ". It lives in " + location ".";
    }
}
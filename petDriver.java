public class petDriver 
{
    public static void main (String args[])
    {
        Dog dog1 = new Dog("Bentley", 5, 13.0, "Shih-tzu", "White/Tan");
        System.out.println(dog1);
    }
}

class Pet
{
    protected String sName;
    protected int iAge;
    protected double dWeight;

    public Pet (String name, int age, double weight)
    {
        sName = name;
        iAge = age;
        dWeight = weight;
    }

    public String getName ()
    {
        return sName;
    }

    public void setName (String name)
    {
        sName = name;
    }

    public String toString ()
    {
        return "Name: " + sName + " Age: " + iAge + " Weight: " + dWeight;
    }
}

class Dog extends Pet
{
    private String sBreed;
    private String sColor;

    public Dog (String n, int a, Double w, String b, String c)
    {
        super(n, a, w);
        sBreed = b;
        sColor = c;
    }

    public String toString()
    {
        return super.toString() + " Breed: " + sBreed + " Color: " + sColor;
    }
}
import java.util.ArrayList;

public class vehicleDriver
{
    public static void main(String[] args) {
        
       ArrayList vehicleList = new ArrayList();

       vehicleList.add(new Car("askfnfeo", 2));
       vehicleList.add(new FarmTruck("jdnfenowdj", 2100));
       vehicleList.add(new Truck("aksndioens", 2400));

       for (int i = 0; i < vehicleList.size(); i++) {
           Vehicle temp = (Vehicle)vehicleList.get(i);
           System.out.print(temp.getVin());
           System.out.println("\t" + temp.getTax());
       }
    }
}

interface Transportation
{
    public String getVin();
    public double getTax();
}
abstract class Vehicle implements Transportation
{
    private String vin;

    public Vehicle (String v)
    {
        vin = v;
    }

    public String getVin ()
    {
        return vin;
    }

    public abstract double getTax();
}

class Car extends Vehicle
{
    private int age;

    public Car (String v, int a)
    {
        super(v);
        age = a;
    }

    public double getTax ()
    {
        if (age < 3)
        {
            return 100;
        }
        else
        {
            return 50;
        }
    }
}

class Truck extends Vehicle
{
    private int weight;

    public Truck (String v, int w)
    {
        super(v);
        weight = w;
    }

    public double getTax ()
    {
        return weight * 0.17;
    }
}

class FarmTruck extends Truck
{
    public FarmTruck (String v, int w)
    {
        super(v, w);
    }

    public double getTax ()
    {
        return super.getTax() * 0.8;
    }
}
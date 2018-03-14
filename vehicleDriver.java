public class vehicleDriver
{
    public static void main(String[] args) {
        
        Vehicle car1 = new Car("1234",4);
        Vehicle truck1 = new Truck("1543", 5000);
        Vehicle farmTruck1 = new FarmTruck("1874", 4000);

        System.out.println("Vin: " + car1.getVin() + " Tax: " + car1.getTax());
        System.out.println("Vin: " + truck1.getVin() + " Tax: " + truck1.getTax());
        System.out.println("Vin: " + farmTruck1.getVin() + " Tax: " + farmTruck1.getTax());
    }
}

abstract class Vehicle
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
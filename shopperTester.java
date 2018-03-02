public class shopperTester {

    public static void main(String[] args) {
        
        Shopper s1 = new Shopper("Bob");
        System.out.println(s1);
        s1.makePurchase(100);
        System.out.println(s1);

        SeniorShopper s2 = new SeniorShopper("Sue");
        System.out.println(s2);
        s2.makePurchase(100);
        System.out.println(s2);
    }
}

/**
 * Shopper
 */
class Shopper {

    private String name;
    private double turkeyPoints;

    public Shopper (String n) {
        name = n;
        turkeyPoints = 0;
    }

    public void makePurchase(double amount) {
        turkeyPoints += amount;
    }

    public String toString() {
        return "Name = " + name + ", Turkey Points = " + turkeyPoints;
    }
}

/**
 * SeniorShopper
 */
class SeniorShopper extends Shopper {

    public SeniorShopper(String n) {
        super(n);
    }

    public void makePurchase(double amount) {
        super.makePurchase((amount * 1.5));
    }

    public String toString() {
        return "SeniorShopper " + super.toString();
    }
}
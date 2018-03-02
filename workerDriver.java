public class workerDriver
{
   public static void main(String[] args) {
       Worker w1 = new Worker("Warren", 10);
       System.out.println("\n" + w1);
       System.out.println("Pay = " + w1.computePay(50));  

       Worker h1 = new HourlyWorker("Howie", 10);
       System.out.println("\n" + h1);
       System.out.println("Pay = " + h1.computePay(50));

       SalariedWorker s1 = new SalariedWorker("Sally", 25);
       s1.takeSickDays();
       System.out.println("\n" + s1);
       System.out.println("Pay = " + s1.computePay(50));
   }
}

class Worker{
    private String name;
    private double rate;

    public Worker(String n, double r) {
        name = n;
        rate = r;
    } 

    public double getRate() {
        return rate;
    }
    
    public final String getName() {
        return name;
    }

    public double computePay(int hours) {
        return rate * hours;
    }

    public String toString() {
        return "Name: " + name + ", Pay Rate = " + rate;
    }
}

class HourlyWorker extends Worker{
    
    public HourlyWorker(String n, double r) {
        super(n, r);       
    }

    public double computePay(int hours) {
        if (hours > 40) {
            return (getRate() * 40) + (getRate() * 1.5 * hours - 40);
        }
        return super.computePay(hours);
    }
}

/**
 * SalariedWorker
 */
class SalariedWorker extends Worker {

    private int sickDays;

    public SalariedWorker(String n, double r) {
        super(n,r);
        sickDays = 10;
    }

    public double computePay(int hours) {
        if (hours > 50) {
            sickDays++;
        }
        return super.computePay(40);
    }

    public void takeSickDays() {
        sickDays--;
    }

    public String toString() {
        return super.toString() + ", Sick Days Remaining: " + sickDays;
    }
}
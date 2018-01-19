public class lineRunner
{
    public static void main (String args[])
    {
        Line line1 = new Line(1, 2, 3, 4);
        
        System.out.println(line1.toString());
        System.out.println("Slope: " + line1.slope());
        System.out.println("Distance: " + line1.distance());
    }
}
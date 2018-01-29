import java.util.Arrays;

public class TwoDarrays1
{
    public static void main (String [] args)
    {
        int a[][] = {{10,30,50,200},
                     {60,40,70,55},
                     {80,5,35,100}};
        
        double total = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                total += a[i][j];
            }
        }

        System.out.println("Sum: " + total);
        System.out.println("Average: " + (total / (a.length * a[0].length)));
    }
}
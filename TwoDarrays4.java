

public class TwoDarrays4
{
    public static void main (String args[])
    {
        int a[][] = {{10,30,50,200},
                     {60,40,70,55},
                     {80,5,35,100}};
        int total = 0;
        int total2 = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                total += a[i][j];
                total2 += a[j][i];
            }

            System.out.println((double)total / a[0].length);
            System.out.println((double)total / a.length);
            total = 0;
            total2 = 0;
        }

        
    }
}
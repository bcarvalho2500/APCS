/*
    A program using a 2D array and finds the largest and smallest
    number of all the numbers in the list.
*/
public class TwoDarrays2
{
    public static void main (String args[])
    {
        int a[][] = {{10,30,50,200},
                     {60,40,70,55},
                     {80,5,35,100}};

        int largest = a[0][0];
        int smallest = a[0][0];

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                if (a[i][j] > largest)
                {
                    largest = a[i][j];
                }
                if (a[i][j] < smallest)
                {
                    smallest = a[i][j];
                }
            }
        }

        System.out.println("Largest: " + largest + "     Smallest: " + smallest);
    }
}
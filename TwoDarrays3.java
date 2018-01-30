/*

*/

public class TwoDarrays3
{
    public static void main (String args[])
    {
        int a[][] = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12}};
        
        int oddCount = 0;
        int evenCount = 0;
        
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                if (a[i][j] % 2 == 0)
                {
                    evenCount++;
                }
                if (a[i][j] % 2 != 0)
                {
                    oddCount++;
                }
                
            }
        }

        System.out.println("OddCount: " + oddCount + "    EvenCount: " + evenCount);
    }
}
public class countLeadingZeros {

    public static void main (String args[])
    {
        int[] array1 = {0,0,0,0,1,0,0,0};

        System.out.println(countZeros(array1));
    }    
    public static int countZeros (int [] arr)
    {
        int count = 0;
            
        for (int x = 0; x < arr.length; x++)
        {
            if (arr[x] == 0)
            {
                count++;
            }
            else
            {
                x = arr.length;
            }
        }

        return count;
    }
    
}
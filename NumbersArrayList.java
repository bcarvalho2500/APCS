import java.util.ArrayList;

public class NumbersArrayList
{
    public static void main (String [] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(14);
        numbers.add(16);
        numbers.add(12);
        for (int y = 0; y < numbers.size(); y++)
        {
            if (numbers.get(y) == 16)
                numbers.remove(y);
        }
        System.out.println("Size: " + numbers.size());
        numbers.set(2, 7);
        numbers.add(2, 6);
        System.out.println("Size: " + numbers.size());
        for (int x: numbers)
        {
            System.out.println(x);
        }
    }
}
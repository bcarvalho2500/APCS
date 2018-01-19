
public class page
{
    private int count;

    public page () 
    {
        count = 0;
    }

    public page (int x)
    {
        count = x;
    }

    public void setCount (int x)
    {
        count = x;
    }

    public int getCount ()
    {
        return count;
    }

    public String toString ()
    {
        return ("The page count is " + count);
    }
}
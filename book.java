public class book
{
    private page pages;
    private int nump;

    public book ()
    {
        pages = new page(0);
        nump = 0;
    }

    public book (int x, int y)
    {
        pages = new page(x);
        nump = y;
    }

    public int numWords ()
    {
        return (nump * pages.getCount());
    }

    public String toString ()
    {
        return ("There are " + nump + " pages and each page has " + pages.getCount() + " words");
    }
}
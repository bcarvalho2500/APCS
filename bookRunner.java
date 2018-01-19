public class bookRunner
{
    public static void main (String args[])
    {
        book book1 = new book(400, 500);
        System.out.println("Book 1: " + book1.toString());
        System.out.println("There are a total of " + book1.numWords() + " words");

        book book2 = new book(250, 600);
        System.out.println("Book 2: " + book2.toString());
        System.out.println("There are a total of " + book2.numWords() + " words");

        if(book1.numWords() > book2.numWords())
        {
            System.out.println("Book 1 has the most words");
        }else{
            System.out.println("Book 2 has the most words");
        }
    }
}
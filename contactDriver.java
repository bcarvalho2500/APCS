import java.util.ArrayList;

public class contactDriver
{
    public static void main (String args[])
    {

        contacts myPhone = new contacts();
        myPhone.printContacts();
        myPhone.addContact("Shaker");
        myPhone.printContacts();
    }
}

class contact
{
    private String name;

    public contact (String n)
    {
        name = n;
    }

    public void setName (String n)
    {
        name = n;
    }

    public String getName ()
    {
        return name;
    }
}

class contacts
{
    private ArrayList <contact> names;

    public contacts ()
    {
            names = new ArrayList <contact> ();
            contact x = new contact("Big Bodacious Bertha");
            names.add(x);
            names.add(new contact("Cool Cid Cevin"));
            names.add(new contact("Titanium Tipped Tyrone"));
    }

    public void addContact (String n)
    {
        contact x = new contact (n);
        names.add(x);
    }
    public void changeContact (int i, String n)
    {
        names.get(i).setName(n);
    }

    public void removeContact (String n)
    {
        for (int y = 0; y < names.size(); y++)
        {
            if (names.get(y).getName().equals(n))
            {
                names.remove(y);
            }
        }
    }

    public int findContact (String n)
    {
        int c = 0;
        for (int x = 0; x < names.size(); x++)
        {
            if (names.get(x).getName().equals(n))
            {
                c = x;
            }
        }
        return c;
    }

    public void printContacts ()
    {
        for (contact n: names)
        {
            System.out.println(n.getName());
        }
    }
}
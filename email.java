public class email
{
    public static void main (String[] args)
    {
        emailClass myEmail = new emailClass("bcarvalho2500@gmail.com");
        
        System.out.println(myEmail.toString());
        System.out.println("Hello");
    }
}

class emailClass
{
    private String email;

    public emailClass() 
    {
        email = "joesmo@email.org";
    }

    public emailClass(String e)
    {
        email = e;
    }

    public String returnUserName()
    {
        return (email.substring(0, email.indexOf("@")));
    }

    public String returnServer()
    {
        return (email.substring(email.indexOf("@") + 1, email.indexOf(".")));
    }

    public String returnDomain()
    {
        return (email.substring(email.indexOf(".") + 1));
    }

    public String toString()
    {
        return ("Username is: " + returnUserName() + "  Server is: " + returnServer() + "  Domain is: " + returnDomain());
    }
    
}
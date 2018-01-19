public class password
{
    public static void main (String[] args)
    {
        passwordClass mypassword = new passwordClass("Mickey Mouse",1928);
        
        System.out.println("Username: " + mypassword.usernameCreation());
        System.out.println("Password: " + mypassword.passwordCreation());
    }
}

class passwordClass
{
    private String userName;
    private int yearOE;

    public passwordClass()
    {
        userName = "Joe Schmo";
        yearOE = 2000;
    }    

    public passwordClass(String u, int y)
    {
        userName = u;
        yearOE = y;
    }

    public String usernameCreation()
    {
        return (userName.substring(0, 1) + userName.substring(userName.indexOf(" ") + 1));
    }

    public String passwordCreation()
    {
        return (userName.substring(0, 3) + yearOE + userName.substring(userName.indexOf(" ") + 1, userName.indexOf(" ") + 4));
    }
}
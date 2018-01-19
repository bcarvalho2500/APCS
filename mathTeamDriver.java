
public class mathTeamDriver
{
    private static int[] list = {45,87,31,29,19,63,55,99,70};
    
    public static void main (String args[])
    {
        
    }
}
class mathTeam
{
    private Mathlete [] team;

    public mathTeam()
    {
        String n= " ";
        int g=0;
        int s=0;
        team = new Mathlete[3];
        String [] names={"Katie  "  , "Mike   ", "Brandon"};
        int [] grade={12,12,12};
        int [] score={100,90,80};
        for(int x=0; x<team.length; x++)
            {
                n=names[x];
                g=grade[x];
                s=score[x];
                team[x]=new Mathlete(n,g,s);
            }
    }
    public String toString()
    {
        String teamSt=" ";
        for (int x = 0; x < team.length; x++)
        {
            teamSt=teamSt+team[x].toString();
        }
        return teamSt;
    }

}

class Mathlete
{
    private String name;
    private int grade;
    private int score;

    public Mathlete()
    {
        name=" ";
        grade=0;
        score=0;
    }
    public Mathlete(String x, int y, int z)
    {
        name=x;
        grade=y;
        score=z;
    }
    public String getName()
    {
        return name;
    }
    public int getGrade()
    {
        return grade;
    }
    public int getScore()
    {
        return score;
    }
    public String toString()
    {
        return ("Name: " + name + "  Grade: " + grade + "  Score: " + score + "\n ");
    }
}
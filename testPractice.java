public class testPractice
{
    public static void main (String args[])
    {
        Deck deck = new Deck();
    }
}

class Deck 
{
       private Card[] cards;
       private int size;

       public Deck() 
       {
          cards = new Card[52];
          size = 0;
       }

       public void add(String suit, String rank, int value)
       {
          Card temp = new Card(suit,rank,value);
          cards[size] = temp;
          size++;
       } 

       public String toString()
       {
          String temp = "";
          for (int k = 0; k < size; k++)
             temp = temp + cards[k] + "\n";
          return temp;   
       }
}





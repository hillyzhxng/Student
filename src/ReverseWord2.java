import java.util.Scanner;

public class ReverseWord2 
{//start class
    public static void main (String[] args)
    {//start main
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a word");
        
        String word = sc.nextLine();
        
        char[] myLetters = new char[word.length()];
        
        for (int i = 0; i < myLetters.length; i++)
        {
            myLetters[i] = word.charAt(i);
            System.out.println(myLetters[i]);
        }
        
        for (int i = myLetters.length-1; i>0; i--) 
        {
            System.out.println();
            System.out.println(myLetters[i]);
        }     
        
    }//end main
  
}//end class

public class ReverseWord 
{
    public static void main (String[] args)
    {
        char[] myArray = new char [8];
        myArray [0] = 's';
        myArray [1] = 't';
        myArray [2] = 'u';
        myArray [3] = 'd';
        myArray [4] = 'e';
        myArray [5] = 'n';
        myArray [6] = 't';
        myArray [6] = 's';
        
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }
    }
}

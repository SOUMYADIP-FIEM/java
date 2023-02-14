import java.util.Scanner;
public class sequencewithadd
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = in.nextLine();
        str = str.toLowerCase();
        int len = str.length();
        String sortedStr = "";
        for (char ch = 'a'; ch <= 'z'; ch++) 
        {
            for (int i = 0; i < len; i++) 
            {
                char strCh = str.charAt(i);
                if (ch == strCh) 
                {
                    sortedStr += strCh;
                }
            }
        }        
        System.out.println("alphabetical order : ");
        System.out.println(sortedStr);      
        String filledStr = "";
        for (int i = 0; i < len - 1; i++) 
        {
            char strCh = sortedStr.charAt(i);
            filledStr += strCh;
            for (int j = strCh + 1; j < sortedStr.charAt(i+1); j++) 
            {
                filledStr += (char)j;
            }
        }
        filledStr += sortedStr.charAt(len - 1);
        System.out.println("filled String : ");
        System.out.println(filledStr);
    }
}
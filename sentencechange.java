import java.util.*;
public class sentencechange
{
    public static void main(String[] args) 
   {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a sentence : ");
        String str = in.nextLine();
        int len = str.length();
        if (str.charAt(len - 1) != '.') 
        {
            System.out.println("error!");
            System.out.println("sentence should end with full stop : ");
            return;
        }
        if (Character.isLowerCase(str.charAt(0))) 
        {
            System.out.println("error!");
            System.out.println("sentence should start with upper case letter : ");
            return;
        }
        String ipStr = Character.toLowerCase(str.charAt(0)) + str.substring(1, len - 1);
        StringTokenizer st = new StringTokenizer(ipStr);
        int wordCount = st.countTokens();
        String strArr[] = new String[wordCount];
        for (int i = 0; i < wordCount; i++) 
        {
            strArr[i] = st.nextToken();
        }
        for (int i = 0; i < wordCount - 1; i++) 
        {
            for (int j = 0; j < wordCount - i - 1; j++) 
            {
                if (strArr[j].length() > strArr[j + 1].length()) 
                {
                    String t = strArr[j];
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = t;
                }
            }
        }        
        strArr[0] = Character.toUpperCase(strArr[0].charAt(0))
                    + strArr[0].substring(1);         
        System.out.println("Sorted String:");
        for (int i = 0; i < wordCount; i++) 
        {
            System.out.print(strArr[i]);
            if (i == wordCount - 1) 
            {
                System.out.print(".");
            }
            else 
            {
                System.out.print(" ");
            }
        }
    }
}
import java.util.*;
public class space
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = in.nextLine();
        int len = str.length();
        StringTokenizer st = new StringTokenizer(str);
        String newStr = "";
        while (st.hasMoreTokens()) 
        {
            String word = st.nextToken();
            newStr += word + " ";
        }
        newStr = newStr.trim();
        System.out.println("Output String:");
        System.out.println(newStr);
    }
}
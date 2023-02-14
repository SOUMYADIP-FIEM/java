import java.util.*;
public class string
{
    public static void main(String[] args) 
{
        Scanner in = new Scanner(System.in); 
        System.out.println("enter a word:");
        String str = in.nextLine();
        int n = str.length();
        int len = str.length();
        if (len != n) 
        {
            System.out.println("invalid input!");
            System.out.println("please enter a five letter word");
            return;
        }

        for (int i = 0; i < len; i++) 
        {
            for (int j = 0; j < len; j++) 
            {
                for (int k = 0; k < len; k++) 
                {
                    for (int l = 0; l < len; l++) 
                    {
                        for (int m = 0; m< len; m++) 
                        {
                        if (i != j && i != k && i != l && i != m && j != k && j != l && j != m && k!= l && k!= m && l!= m) 
                            {
                            System.out.print(str.charAt(i));
                            System.out.print(str.charAt(j));
                            System.out.print(str.charAt(k));
                            System.out.print(str.charAt(l));
                            System.out.println(str.charAt(m));
                            }
                        }
                    }
                }
            }
        }
    }
}
 import java.util.*;
 public class palindrome
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a no.");
         int n=sc.nextInt();
         palindrome p = new palindrome();
         int k=p.checkPalindrome(n);
         p.display(k);
    }

  public static int checkPalindrome(int x)
     {
         int k=x;
         int sum=0;
         while(x>0)
         {
             int a=x%10;
             sum=sum*10+a;
             x=x/10;
         }
         if(sum==k)
            return 1;
         else
            return 0;
     }
public static void display(int y)
{
    if(y==1)
     System.out.println("plindrome");
   else
      System.out.println("not palindrome");
}
 }

       
       
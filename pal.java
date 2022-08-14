 import java.util.*;
 public class pal
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a no.");
         int n=sc.nextInt();
        boolean p= pali(n);
         if(p)
         {
             System.out.println("this is palindrome");
         }  
         else
         {
             System.out.println("this is not palindrome");
         }
         
    }
     public static boolean  pali(int x)
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
         return true;
         else
         return false;
     }
 }
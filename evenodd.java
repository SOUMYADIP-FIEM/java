 import java.util.*;
 public class evenodd
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a no.");
         int n=sc.nextInt();
         if(n%2==0)
         {
         System.out.println("even number is" +n);
         }
         else
         {
         System.out.println("odd number is" +n);
         }
     }
 }
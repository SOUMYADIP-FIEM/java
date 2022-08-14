 import java.util.*;
 public class prime
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a no.");
         int n=sc.nextInt();
         if(prime(n))
         {
            System.out.println("prime number is"+n);
         }
         else
         {   
            System.out.println("number is not prime"+n);
         
         }
     }    
     public static boolean  prime(int x)
     {
        
         int c=0;
         for(int j=1;j<=x;j++)
         {
             if(x%j==0)
             c++;
         }         
         if(c==2)
            return true;
         else
            return false;
     }
 }
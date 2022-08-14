import java.util.*;
 public class palprime
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a no.");
         int n=sc.nextInt();
         if(pprime(n))
         {
            System.out.println("palprime number is"+n);
         }
         else
         {   
            System.out.println("number is not palprime"+n);
         
         }
     }    
     public static boolean  pprime(int x)
     {
         int c=0;
         for(int j=1;j<=x;j++)
         {
             if(x%j==0)
             c++;
         }
         int k=x,sum=0;
         while(x>0)
         {
             int a=x%10;
             sum= sum*10+a;
             x=x/10;
         }
         if(k==sum && c==2)
            return true;
         else
            return false;
     }
 }
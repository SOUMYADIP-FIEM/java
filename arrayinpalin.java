 import java.util.*;
 public class arrayinpalin
 {
     public static void main(String[] args)
     {
          int i,count=0;
         Scanner sc = new Scanner(System.in);  
         System.out.println("enter number of elements");  
         int n = sc.nextInt();   
        int  a[]= new  int[n];  
         System.out.println("enter those" + n);  
         for (i = 0; i < n; i++) 
         a[i] = sc.nextInt();
          for (i = 0; i < n; i++) 
        {
         boolean p= pali(a[i]);
         if(p)
         {
             System.out.println("this is palindrome");
             count++;
         }  
         else
         {
             System.out.println("this is not palindrome");
         }
         }
          System.out.println("count of palindrome" +count);
    }
     public static boolean  pali(int x)
     {
         int k=x;
         int sum=0;
         while(x>0)
         {
             int b=x%10;
             sum=sum*10+b;
             x=x/10;
         }
         if(sum==k)
         return true;
         else
         return false;
     }
 }
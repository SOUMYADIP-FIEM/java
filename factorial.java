 import java.util.*;
 public class factorial
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a no.");
         int n=sc.nextInt();
         factorial p = new factorial();
         int k=p.checkFactorial(n);
         p.display(k);
    }

  public static int checkFactorial(int x)
     {
         int fact=1;
        for(int j=1;j<=x;j++)
        {
          fact = fact * j;
          }
        return fact;
        }
public static void display(int y)
{
     System.out.println("factorial is"+y);
}
}

       
       
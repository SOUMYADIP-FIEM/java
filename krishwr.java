import java.util.*;
public class krishwr
{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter one number");
         int n=sc.nextInt();
         int temp=n;
         int sum=0;
         while(temp!=0)
         {
                int r=temp%10;
                sum=sum+fact(r);
                temp=temp/10;
          } 
          if(n==sum)
                System.out.println("Krishnamurti " +n);
          else
                System.out.println("Not Krishnamurti " +n);
      }
      public static int fact(int x)
      {
          int f=1;
          for(int i=1;i<=x;i++)
          f=f*i;
          return f;
      }

}
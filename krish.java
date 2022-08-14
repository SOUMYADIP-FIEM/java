import java.util.*;
public class krish
{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two limit");
         int n=sc.nextInt();
         int k=sc.nextInt();
         for(int i=n;i<=k;i++)
         {
             int temp=i;
             int sum=0;
             while(temp!=0)
             {
                int r=temp%10;
                sum=sum+fact(r);
                temp=temp/10;
             }
             
             if(i==sum)
             System.out.println(""+i);
         }
       
     }
     public static int fact(int x)
     {
         int f=1;
         for(int i=1;i<=x;i++)
         f=f*i;
         return f;
     }

}
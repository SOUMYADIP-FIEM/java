import java.util.*;
public class magic
{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter upper number");
         System.out.println("enter lower number");
         int n=sc.nextInt();         
         int f=sc.nextInt();
         for(int i=n;i<=f;i++)
{
         int temp=i;
         int sum=0;
         int pro=1;
         while(temp!=0)
         {
                int r=temp%10;
                sum=sum+r;
                pro=pro*r;
                temp=temp/10;
          } 
          if(i==(sum+pro))
                System.out.println("magic" +i);
}
      }
}
     

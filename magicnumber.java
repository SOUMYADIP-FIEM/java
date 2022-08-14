import java.util.*;
public class magicnumber
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter lower number");
      System.out.println("enter upper number");
     int a=sc.nextInt();
     int g=sc.nextInt();
     for(int i=a;i<=g;i++)
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
            System.out.println("magic"+i);
   }
}
}
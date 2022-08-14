import java.util.*;
public class newmagic1
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter one number");
     int n=sc.nextInt();
     int temp=n;
     int sum=0;
     int pro=1;
     while(temp!=0)
     {
         int r=temp%10;
         sum=sum+r;
         pro=pro*r;
         temp=temp/10;
      }
      if(n==(sum+pro))
            System.out.println("magic"+n);
      else  
            System.out.println(" Not magic"+n);
}
}
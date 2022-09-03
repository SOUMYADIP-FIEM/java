import java.util.*;
public class compositemagic
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter one number");
     int n=sc.nextInt();
     int temp=n;
     int sum=0;
     while(temp>9)
     {
     sum=0;
     while(temp!=0)
     {
         int r=temp%10;
         sum=sum+r;
         temp=temp/10;
      }
      temp=sum;
      }
      int c=0;
      for(int i=1;i<n;i++)
      {
        if(n%i==0) 
        c++;
      }
      if(c>1 && sum==1)
            System.out.println("compositemagic "+n);
      else  
           System.out.println(" not compositemagic "+n);
}
}


      
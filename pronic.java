import java.util.*;
public class pronic
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter one number");
     int n=sc.nextInt();
     int flag=0;
       for(int i=1;i<n;i++)
       {
           if((i*(i+1))==n)
              {
                     flag=1;
                     break;
               }
       }
       if(flag==1)
       System.out.println("it is pronic number");   
       else
       System.out.println("it is not pronic number");       
      }
}
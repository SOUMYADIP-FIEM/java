import java.util.*;
public class twisted_number
{
   public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int a =sc.nextInt();
   int sum=0,flag,reverse;
    while(a!=0)
{
   reverse =a%10;
   sum=sum*10+reverse;
   a=a/10;
  }
   flag=0;
   for(int i=2;i<sum;i++)
{
  if(sum%i==0)
{
flag=1;
break;
}
}
if (flag==0)
System.out.println("twisted prime");
  else
System.out.println("not twisted prime");  
}
}
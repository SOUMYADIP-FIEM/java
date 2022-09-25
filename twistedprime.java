import java.util.*;
public class twistedprime
{
   public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n =sc.nextInt();
    twistedprime p = new twistedprime();
    int q=p.prime(n);
    int k=p.checkTwistedprime(n);
    if (q==0 && k==0)
    {
    System.out.println("twisted prime");
    }
    else
    {
    System.out.println("not twisted prime");  
    }
}

int checkTwistedprime(int x)
{
    int a=x;
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
if(flag==1)
  return 1;
else 
 return 0;
  }
int prime (int y)
{
   int flag1=0;
   for(int j=2;j<y;j++)
  {
  if(y%j==0)
  {
  flag1=1;
  break;
  }
}
if(flag1==1)
  return 1;
else 
 return 0;
  }
}
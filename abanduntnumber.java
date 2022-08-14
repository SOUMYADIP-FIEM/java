import java.util.*;
public class abanduntnumber
{ 
public static void main(String[] args)
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
abanduntnumber a = new abanduntnumber();
if(a.checkAbandunt(n)==1)
{
System.out.println("the no. is Abandunt");
}
else
{
System.out.println("the no. is not Abandunt");
}
}

public int getSum(int n)
{
int sum = 0;
for(int i=1;i<=Math.sqrt(n);i++)
{
if(n%i==0)
{
if(n/i==i)
{
sum = sum+i;
}
else
{
sum = sum+i;
sum = sum+(n/i);
}
}
}
sum = sum-n;
return sum;
}
public int checkAbandunt(int n)
{
int k=n; 
int p=getSum(n);
if(p>k)
{
return 1;
}
else
{
return 0;
}
}
}
       
       
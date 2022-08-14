import java.util.*;
public class coprime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 1st number : ");
System.out.println("Enter the 2nd number : ");
int n=sc.nextInt();
int m=sc.nextInt();
int result = hcf (n,m);
if(result==1)
System.out.println("the numbers are co prime ");
else
System.out.println("the numbers are not co prime ");
}
 static int hcf(int n,int m)
{
while(n!=m)
{
if(n>m)
{
return hcf(n-m,m);
}
else
{
return hcf(n,m-n);
}
}
return n;
}
}

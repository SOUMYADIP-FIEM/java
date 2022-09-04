import java.util.*;
public class bouncingnumber
{
public static void main(String[] args)
{
int p,m,q;
System.out.println("enter anumber");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
m = n;
int prev=m%10;
int incre=1;
int decre=1;
while(m>0)
{
    p = m%10;
    if(p>prev)
{
       incre=0;
       break;
}
   prev=p;
   m = m/10;
}
while(m>0)
{
    q = m%10;
    if(q<prev)
{
       decre = 0;
       break;
}
    prev=q;
    m = m/10;
}
if(incre == 0 && decre == 0)
   System.out.println("it is bouncing number");
else
   System.out.println("it is not bouncing number");
}
}
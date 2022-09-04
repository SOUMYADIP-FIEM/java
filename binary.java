 import java.util.*;
 public class binary
 {
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a no.");
 int n=sc.nextInt();
 String s="";
while(n>0)
{
int p=n%2;
s = p+s;
n = n/2;
}
System.out.println("binary number is : " +s);
}
}
         
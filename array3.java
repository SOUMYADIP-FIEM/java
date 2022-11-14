import java.util.*;   
public class array3
{  
  public static void main(String[] args)  
  {  
    int i, a[], sum=0;  
    Scanner sc = new Scanner(System.in);  
    System.out.println("enter number of elements");  
    int n = sc.nextInt();   
    a = new int[n];  
    System.out.println("enter those" + n);  
    for (i = 0; i < n; i++)  
      a[i] = sc.nextInt();  
int evensum=0,oddsum =0;
for(i=0;i<n;i++)
{
if( i%2 == 0)
evensum = evensum+a[i];
else
oddsum = oddsum+a[i];
}
sum = evensum - oddsum;
System.out.println("result is" +sum);  
}
}
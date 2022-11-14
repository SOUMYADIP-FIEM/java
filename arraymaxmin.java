import java.util.*;   
public class arraymaxmin
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
    int max,min;
    min = max = a[0];
    for (int j = 1; j<n; j++) 
         {
            if (a[j] < min)
            min = a[j];
            if(a[j] > max)
            {
               max = a[j];
            }
            }
   System.out.println("min is: " + min + "; max is: " + max);
}
}
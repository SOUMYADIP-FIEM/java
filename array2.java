import java.util.*;   
public class array2
{  
  public static void main(String[] args)  
  {  
    int i, search, a[];  
    Scanner sc = new Scanner(System.in);  
    System.out.println("enter number of elements");  
    int n = sc.nextInt();   
    a = new int[n];  
    System.out.println("enter those" + n);  
    for (i = 0; i < n; i++)  
      a[i] = sc.nextInt();  
    System.out.println("enter finding value");  
    search = sc.nextInt();
    int f=0;  
    for (i = 0; i < n; i++)  
    {  
      if (a[i] == search)
      {  
         f=1;
           break;  
      }  
   }  
   if (f == 1)  
      System.out.println("linearsearch");  
   else
      System.out.println("not linearsearch");
  }  
}  
import java.util.*;   
public class sort
{  
  public static void main(String[] args)  
  {       
    Scanner sc = new Scanner(System.in);  
    System.out.println("enter number......");  
    int n = sc.nextInt(); 
    int a[]=new int[3];  
    int i=0,p;
    while(n>0)
    {
        p = n%10;
         a[i++]=p;
        n=n/10;
    }
     i--;
     System.out.println("array is : " +a[i]); 
    Arrays.sort(a);   
    System.out.println("elements of array sorted in ascending order: ");  
    for (int j = 0; j <a.length; j++)   
    {       
       System.out.println(a[j]);   
    }   
}
}


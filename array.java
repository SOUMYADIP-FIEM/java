import java.util.*;
public class array
{
   public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n= sc.nextInt();
    int a[] = new int [20];
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
}
import java.util.*;
public class array1
{
   public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n= sc.nextInt();
    int a[] = new int [n];
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
      int sum = sum + a[i];
    }
    for(int i=0;i<n;i++)
    {
      System.out.println(sum);
    }
  }
}
import java.util.*;
public class array2d
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int a[][] = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] =sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }   
    }    
}
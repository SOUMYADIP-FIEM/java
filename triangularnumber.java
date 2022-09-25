import java.util.*;
public class triangularnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ending number");
        int n=sc.nextInt();
        if(n < 3)
        {
        System.out.println("invalid input");
        }
        int sum=1;
        for (int i=2;sum<=n;i++)
        {
	sum=sum+i;
	System.out.println(sum);
                  
        }
}
}
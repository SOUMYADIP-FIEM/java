import java.util.*;
public class dudeny_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        double p=Math.cbrt(n);
        double sum=0.0;
        int t=n;
        while(n!=0)
        {
            int d=n%10;
            sum= sum+d;
            n=n/10;
        }
        if(sum==p)
            System.out.println("dedeny no. :" +t);
        else
            System.out.println("not dedeny no. :" +t);
    }
}
 
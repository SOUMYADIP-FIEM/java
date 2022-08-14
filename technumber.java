import java.util.*;
public class technumber
{
    public static void main(String[] args)
    {
        int n,m,p=0,q=0,c=0,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check : ");
        n = sc.nextInt();
        m=n;
        while(m>0)
        {
            c++;
            m=m/10;
        }
        if(c==4)
        {
            m=n;
            p=m/100;
            q=m%100;
            s = (p+q)*(p+q);
            if(n==s)
            {
                System.out.println("technumber : " +n);
            }
            else
            {
                System.out.println("non-technumber : " +n);
            }
        }
        else
        {
            System.out.println("non-technumber : " +n);
        }
    }
}

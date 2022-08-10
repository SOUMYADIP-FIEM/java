import java.util.*;  
public class technumber  
{  
    public static void main(String[] args)  
    {  
        int n,m,p,q,c=0,s=0;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number to check: ");    
        n = sc.nextInt();   
        m= n;    
        while (m > 0)  
        {        
            c++;    
            m = m / 10;  
        }  
        if (c % 2 == 0)  
        {  
            m = n;    
            p = m % (int) Math.pow(10, c / 2);   
            q = m / (int) Math.pow(10, c / 2);    
            s = (p + q) * (p + q);    
            if (n == s)  
            {  
                System.out.println("it is a tech number : " +n);  
            }  
            else  
            {  
                System.out.println("it is not a tech number : " +n);  
            }  
        }  
        else  
        {  
            System.out.println("it is not a tech number : " +n);  
        }  
    }  
}  
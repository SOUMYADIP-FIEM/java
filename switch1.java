 import java.util.*;
 public class switch1
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your choice : 1 for addition, 2 for subtraction, 3 for multification, 4 for dividation");
         int ch=sc.nextInt();
         switch(ch)
        {
         case 1 :  System.out.println("enter two no.");
                        int a=sc.nextInt();
        	     int b=sc.nextInt();
         	     int c=a+b;
         	     System.out.println("the result is :" +c);
        	     break;
          case 2 :  System.out.println("enter two no.");
                        int d=sc.nextInt();
        	     int e=sc.nextInt();
         	     int f=d-e;
         	     System.out.println("the result is :" +f);
        	     break;
          case 3 :  System.out.println("enter two no.");
                        int i=sc.nextInt();
        	     int j=sc.nextInt();
         	     int k=i*j;
         	     System.out.println("the result is :" +k);
        	     break;
          case 4 :  System.out.println("enter two no.");
                        int l=sc.nextInt();
        	     int   m=sc.nextInt();
         	     double n=(double)l/m;
         	     System.out.println("the result is :" +n);
        	     break;
          default : System.out.println("the choice was wrong");
        	     break;
          }
         
     }
 }
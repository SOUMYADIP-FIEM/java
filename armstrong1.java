import java.util.*;  
import java.lang.Math;  
public class armstrong1 
{  
static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;    
temp=n;    
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{        
last = temp % 10;   
sum +=  (Math.pow(last, digits));     
temp = temp/10;   
}  
if(n==sum)   
return 1;       
else 
return 0;   
}    
public static void main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the limit: ");   
num=sc.nextInt();  
armstrong a = new armstrong();
int k=a.checkArmstrong(n);
a.display(k);
k=num;
System.out.println("Armstrong Number up to "+ k + " are: ");  
for(int i=0; i<=k; i++)  
if(isArmstrong(i))  
System.out.print(i+ ", ");  
}   
}  
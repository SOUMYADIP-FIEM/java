import java.io.*;
import java.util.*;
class File_Write1
{
public static void main(String[] args) throws IOException
{
Scanner sc = new Scanner(System.in); 
Scanner cs = new Scanner(System.in);
FileWriter fw = new FileWriter("Employees.txt", true); 
BufferedWriter bw = new BufferedWriter (fw);
PrintWriter pw = new PrintWriter(bw); 
System.out.println("Enter 5 names and phone numbers: "); 
for (int i = 1;i<=5;i++)
{
String name = sc.nextLine();
long num = cs.nextLong(); 
pw.println(name); 
pw.println(num);
}
pw.close();
bw.close();
fw.close();
}
}
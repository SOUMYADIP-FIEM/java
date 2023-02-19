import java.io.*;
class File_Read
{
public static void main(String[] args) throws IOException
{
FileReader fr = new FileReader("Employees.txt");
BufferedReader br = new BufferedReader(fr);
int i = 0;
String name =" ";
while((name = br.readLine()) !=null) 
{
i++;
System.out.print("Name "+i+": ");
System.out.println(name);
}
br.close();
fr.close();
}
}
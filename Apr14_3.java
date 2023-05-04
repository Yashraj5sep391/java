
import java.io.*;
class student implements Serializable
{
    int roll_no;
    String name;
    student (int r,String s)
    {
        roll_no=r;
        name=s;
    }
}
public class Apr14_3
{
	public static void main(String[] args) throws Exception
	{
		 FileInputStream fos = new FileInputStream("C:\\t.txt");
         ObjectInputStream oos = new ObjectInputStream(fos);
         student s=(student)oos.readObject(); 
         System.out.println(s.roll_no+" "+s.name);  
         oos.close();
	}
}


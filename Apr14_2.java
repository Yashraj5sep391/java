
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
public class Apr14_2
{
	public static void main(String[] args) throws Exception
	{
		 FileOutputStream fos = new FileOutputStream("waka.txt");
         		ObjectOutputStream oos = new ObjectOutputStream(fos);
		 student s= new student(1,"kk");
		 oos.writeObject(s);

                                                  oos.close();
	}
}


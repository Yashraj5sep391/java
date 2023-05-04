import java.io.*;
public class Apr13_1
{
	public static void main(String[] args) {
	File ref1=new File("E:\\files\\testout.txt");
System.out.println(ref1.isFile());//It will give true 
        File ref2=new File("E:\\files\\testout.txt");
        System.out.println(ref2.exists());
        System.out.println(ref2.getName());
        System.out.println(ref2.getPath());
        File ref3=new File("E:\\files\\testout.txt");
        File ref4=new File("E:\\files\\testout.txt");
        System.out.println(ref3.isHidden());
        System.out.println(ref3.canRead());
        System.out.println(ref3.canWrite());

 File ref5=new File("testout.txt");
        System.out.println(ref5.getPath());
        System.out.println(ref5.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(ref5.lastModified()));
        System.out.println("Length:"+ref5.length());
	}
}

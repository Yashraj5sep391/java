import java.io.*;
import java.util.Date;

public class Apr13_2
{
	public static void main(String args[]) throws IOException
	{
	    File  f1= new File("march26.txt");
	    f1.createNewFile();
	    
	    File f2= new File("/home/sush/Desktop/K19JC/fold");
	    	File[] ff=	f2.listFiles();
	    	    for(File f0: ff)
	    	    	System.out.println(f0.getName()+ new Date(f0.lastModified()));

	    File f3= new File("abc.class");
	     System.out.println("f1 getPath ? "+f1.getPath());
	    System.out.println("f2 getPath ? "+f2.getPath());
	    System.out.println("f3 getPath ? "+f3.getPath());


	    System.out.println("f1  lastModified? "+new Date(f1.lastModified()));
	    System.out.println("f2 lastModified ? "+new Date(f2.lastModified()));
	    System.out.println("f3 lastModified ? "+new Date(f3.lastModified()));

	    System.out.println("f1 is a file ? "+f1.isFile());
	    System.out.println("f2 is a file ? "+f2.isFile());
	    System.out.println("f3 is a file ? "+f3.isFile());

	    System.out.println("f1 is a folder ? "+f1.isDirectory());
	    System.out.println("f2 is a folder ? "+f2.isDirectory());
	    System.out.println("f3 is a folder ? "+f3.isDirectory());
	}
}

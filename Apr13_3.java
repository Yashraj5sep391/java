import java.io.FileOutputStream;  
public class Apr13_3{  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new 	FileOutputStream("C:\Users\yashr\OneDrive\Desktop\JAV JAV\\testout.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
} 

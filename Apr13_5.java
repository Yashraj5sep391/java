import java.io.FileOutputStream;  
public class Apr13_5{  
     public static void main(String args[]){    
          try{    
           String textToAppend = "Hello !!"; //new line in content
    FileOutputStream outputStream = new FileOutputStream("testout.txt", true);//For appending the data here we need to give true in second argument
    byte[] strToBytes = textToAppend.getBytes();
    outputStream.write(strToBytes);
    outputStream.close();   
          }catch(Exception e){System.out.println(e);}    
         }    
        } 


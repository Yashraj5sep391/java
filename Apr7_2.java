


class Apr7_2
{
   static void method()
   {
   	try
     {
        int a= 20;
        System.out.println("throw example");
        throw new ArithmeticException("ae exception");
        //System.out.println("will not execute");
     }
     
     catch(ArithmeticException e){
     System.out.println("Arithemtic exception caught");
     throw e;
     }
   }
public static void main(String args[])
{
 try{   method();    
 }
  catch(ArithmeticException e){
     System.out.println("Arithemtic exception Re-caught");
     }
}
}

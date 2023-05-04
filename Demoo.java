Class Demoo
{
  public static void main(String[] arg){
    int a =60;
    int b =13;
    int c =0;
    c = a & b;
    System.out.println("a & b = " + c);
    c = a | b;
    System.out.println("a | b = " + c);
    c = a ^ b;
    System.out.println("a ^ b = " + c);
    c = ~a;
    System.out.println("~a = " + c);
    c = a >> 2;
    System.out.println("a << 2 = " + c);
    c = a << 2;
    System.out.println("a >> 2 = " + c);
    c = a >>> 2;
    System.out.println("a >>> 2 = " + c);
    int gg = -60;
    c= gg >>> 2;
    System.out.println("gg >>> 2 = " + c);
    c = gg >> 2;
    System.out.println("gg >> 2 = " + c);
    int x = -1;
    c = x >>> 32;
    System.out.println("x >>> 32 = " + c);
    c = x >>> 33;
    System.out.println("x >>> 33 = " + c);
    c = x >>> 34;
    System.out.println("x >>> 34 = " + c);


  }
}
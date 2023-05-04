class A1{
A1(int x)
{System.out.print("Hi");}
}
class B extends A1{
B (int x)
{System.out.print("Hello");}
public static void main(String [] r)
{
B b1 = new B(1);
}
}
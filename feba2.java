// Classes, methods

class Feb2{
int b1=10;
double b2=20.05;
public int meth3(int a,int b,int c)
{
return a+b+c;
}
public void meth2(int a,int b)
{
int c=a+b;
System.out.println("Sum of numbers is "+c);
}
public void meth1()
{
System.out.println("The value of b1 is "+b1);
System.out.println("The value of b2 is "+b2);
}

public static void main(String args[])
{
Feb2 obj1= new Feb2();
obj1.meth1();	obj1.meth2(2,3);
int c= obj1.meth3(10,20,30);
System.out.println("Sum of numbers is:"+obj1.meth3(12,13,14));
System.out.println("Sum of numbers is "+c);
}
}

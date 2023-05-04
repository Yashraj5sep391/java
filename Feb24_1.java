import java.util.*;
class Feb24_1
{
public static void main(String args[])
{
ArrayList a1= new ArrayList();
ArrayList a2= new ArrayList(20);
a1.add(10);
a1.add("virat");
a1.add(20.5);
a1.add(1,"rahul");
System.out.println(a1);

a2.addAll(a1);
System.out.println(a2);

ArrayList a3= new ArrayList(a2);
a3.addAll(a1);
System.out.println(a3);
System.out.println(a1.size());
System.out.println(a2.size());
System.out.println(a3.remove(2));
System.out.println(a3.remove("ajay"));


}
}
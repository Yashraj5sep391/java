class Apr{
String name;
int age;
	Apr(String name,int age)
	{
		this.age= age;  this.name= name;
	}
	public String toString()
	{
		return name+ "  "+age;
	}
}
class Gen<T> {
	T ob; 
	Gen(T o) { 	ob = o; }
	T getob() { return ob; }
	void showType() { 
		System.out.println("Type of T is " +ob.getClass().getName());
	   }	}
class Apr14_4 {
	public static void main(String args[]) {
		Gen<Integer> iOb;
		//iOb = new Gen<Integer>("Hello");
		iOb = new Gen<Integer>(14591);
		iOb.showType();
		int v = iOb.getob();
		System.out.println("value: " + v);
		Gen<String> strOb = new Gen<String>("Virrat");
		strOb.showType();
		String str = strOb.getob();
		System.out.println("value: " + str);
		//iOb=strOb;   
		Gen<Apr> stOb= new Gen<Apr>(new Apr("virat",12));
		stOb.showType();
		System.out.println("value: " + stOb.getob());
 } }

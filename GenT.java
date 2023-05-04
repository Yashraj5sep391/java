class Gen<T> {
	T ob; 
	Gen(T o) 
       { 	
            ob = o; 
       }
	T getob() 
      { 
          return ob; 
      }
	void showType() 
       { 
		System.out.println("Type of T is " +	ob.getClass().getName());
	   }
	}
class GenDemo {
	public static void main(String args[]) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(99);
		iOb.showType();
		int v = iOb.getob();
		System.out.println("value: " + v);
  Gen<String> strOb = new Gen<String>("Generics 	KiJai");
		strOb.showType();
		String str = strOb.getob();
		System.out.println("value: " + str);
 } }

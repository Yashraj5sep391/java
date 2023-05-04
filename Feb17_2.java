class Feb17_2
{
public static void main(String args[])
{
String s1="India";
boolean b1= s1.equals("india");
System.out.println(b1);

System.out.println(s1.equals("India"));
System.out.println(s1.equalsIgnoreCase("INDIA"));

System.out.println(s1.startsWith("Ind"));
System.out.println(s1.startsWith("ind"));
System.out.println(s1.endsWith("ia"));
System.out.println(s1.compareTo("Australia"));
System.out.println(s1.compareTo("New Zealand"));

System.out.println(s1.indexOf("n")); //returns the index of char n
System.out.println(s1.indexOf("di")); //returns the index of d which is first char in substring
String ss= "Welcome to programming in Java";
System.out.println(ss.indexOf("m")); 
System.out.println(ss.indexOf("pro")); 
System.out.println(ss.indexOf("m",7)); 
System.out.println(ss.indexOf("pro",10)); 
System.out.println(ss.lastIndexOf("m")); 
System.out.println(ss.lastIndexOf("pro")); 
System.out.println(ss.lastIndexOf("m",15)); 
System.out.println(ss.lastIndexOf("pro",7)); 
System.out.println(ss.substring(25)); 
System.out.println(ss.substring(25,30)); 
System.out.println(ss.replace('m','n')); 
System.out.println(ss.replace("programming","coding")); 
System.out.println(ss); 
System.out.println(ss.trim()); 

}
}

class Feb17_3
{
    static String arr[] = {"Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their", "country"};
    public static void main(String args[]) {
        for(int j=0;j<arr.length;j++) {
            for(int i=j+1;i<arr.length;i++) {
                if(arr[i].compareTo(arr[j])<0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }
    }
}
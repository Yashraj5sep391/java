class Student 
{
public static void main(String args[])
{
int rollno;
String name;
double weight;
double height;
double bmi;
Student()
{
rollno=0;
name="noname";
weight=height=0;
}
Student(int rollno, String name, double weight, double height)
{
this.rollno=rollno;
this.name=name;
this.weight=weight;
this.height=height;
bmi = calculateBMI();
}
double calculateBMI(); {
        // BMI formula: weight (kg) / height^2 (m^2)
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
 
}
void showDetails();
{
//print all the detail of students
	 System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("BMI: " + bmi);
}
}
}
class CseStudent extends Student
{
String major;
CseStudent() {this.major="Not selected";}
CseStudent(int rollno, String name, double weight, double height,String major)
{
super(rollno,name,weight,height);
this.major=major;
}
void showDetails()
{
super.showDetails();
System.out.println(major);
}
}

class Mar2_1
{
public static void main(String args[])
{
Student s1= new Student();
Student s2= new Student(22,"yash",78,3);
s2.showDetails();
CseStudent s3= new CseStudent(22,"Yash",78,3,"Android");
s3.showDetails();
}
}

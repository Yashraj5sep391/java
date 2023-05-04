import java.util.Scanner;
class Feb17_1
{
 static void drawChecker(int[] a, int key){
 int x = 0 ;
 for(int i=0;i<20;i++){
 if(a[i]==key){
 x=1;
 break;
 }
 }
 if(x!=0){
 System.out.println("YOU ARE LUCKY!!!");
 }
 else{
 System.out.println("YOU ARE NOT LUCKY!!!");
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your lucky number between 1 to 20: ");
 int key = sc.nextInt();
 if(key<0 || key >20){
 System.exit(0);
 }
 int a[] = new int[20];
 for(int i=0; i<20; i++){
 a[i]=(int)(Math.random()*20+1);
 }
 drawChecker(a,key);
 System.exit(0);
 }
}
wap to creat a class examination having a method calculate TGPA
ask the student to enter the marks in 3 subjects
calculate the TGPA of the student return the calculated TGPA of the student
call this method in main for the final output


public class Examination 
{
public static void main(String[] args) 
{
BankAccount b1 = new BankAccount();

int amt;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the marks of the 3 subjects!");
amt = sc.nextInt();
b1.deposit(amt);

System.out.print("Enter amount to withdraw: ");
amt = sc.nextInt();
int newBalance = b1.withdraw(amt);
if (newBalance != -1)
System.out.println("New balance:" + newBalance);
else
System.out.println("Invalid amount");

sc.close();
}

static class BankAccount {
int balance;

// methods

void deposit(int amt) {
this.balance += amt;
}

int withdraw(int amt) {
if (amt > 0 && amt <= this.balance) {
this.balance -= amt;
return this.balance;
} else {
System.out.println("Invalid amount");
return -1;
}
}

}
}
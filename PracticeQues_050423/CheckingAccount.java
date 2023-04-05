/* Create an interface called "BankAccount" with methods called "deposit" and "withdraw".
 Create a class called "CheckingAccount" that implements the BankAccount interface and 
implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount
 class and call both the "deposit" and "withdraw" methods.*/

package Practicals050423;

interface BankAccount     //creating interface
{
	public void deposit();   //abstract methods
	public void withdraw();
}
public class CheckingAccount implements BankAccount     //class implements the interface
{
	public void deposit()    //giving body to abstract method
	{
		System.out.println("This is the deposit method of interface BankAccount");
	}
	public void withdraw()   //giving body to abstract method
	{
		System.out.println("This is the withdraw method of interface BankAccount");
	}
	public static void main(String[] args)   //main method
	{
		CheckingAccount c1= new CheckingAccount();    //creating objects
		c1.deposit();     //calling methods
		c1.withdraw();
	}

}

/*Write a program in java showing overloading of Add method with 2 and 3 parameters.
In the user passes 2 values method with 2 parameter should be called if he passes 3 
values method with 3 parameters should be called*/
import java.util.Scanner;       //importing scanner
class Add
{
	public void Add(int a, int b)       //method add for two parameters
	{
		System.out.println("Addition of two numbers is: "+(a+b));   //printing output
	}
	public void Add(int a, int b, int c)     //method add for three parameters
	{
		System.out.println("Addition of three numbers is: "+(a+b+c));   //printing output
	}
}

class UseAdd    //class with main method
{
	public static void main(String args[])     //main method
	{
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of digits you want to add 2 or 3: ");
		i= sc.nextInt();
		if(i==2)  //checking condition to goto a method
		{
				for (i=0; i<2; i++)
			{
				int a= sc.nextInt();           //getting input values from user
				int b= sc.nextInt();
				Add a1= new Add();
				a1.Add(a,b);         //calling add method with 2 parameters
			}
		}
		else if(i==3)        //checking condition to goto a method
		{
				for(i=0; i<3; i++)
			{
				int a= sc.nextInt();
				int b= sc.nextInt();        //getting input values from user
				int c= sc.nextInt();
				Add a2= new Add(); 
				a2.Add(a,b,c);              //calling add method with 3 parameters
			}
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}


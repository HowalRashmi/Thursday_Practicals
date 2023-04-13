/* Write a program to take input of marks of 3 subjects from the user. Check if the total of 
marks given by the user is greater than 50 else throw an exception saying "You Failed". Or 
else print Grade is A if the total is greater than 280. Grade B if the total is greater than 200.
Grade C if the total is greater than 150. Grade D if the total is greater than 50*/
package practicals130423;

import java.util.Scanner;

public class GradeEx {	

	void grades(double total)    //creating method
	{
		if(total<50)   //checking condition 
		{
			throw new ArithmeticException("You Failed");    //throws user-defined exception
		}
		else if(total>280)   //checks condition for A grade
		{
			System.out.println("You passed with A Grade");
		}
		else if(total<=280 && total>200)      //checks condition for B grade
		{
			System.out.println("You passed with B Grade");
		}
		else if(total<=200 && total>150)        //checks condition for C grade
		{
			System.out.println("You passed with C Grade");
		}
		else if(total<=150 && total>50)       //checks condition for D grade
		{
			System.out.println("You passed with D Grade");
		}
	}
		
	public static void main(String[] args) {
		double total;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks of three subjects: ");
		int sub1= sc.nextInt();
		int sub2= sc.nextInt();      //getting input from user
		int sub3= sc.nextInt();
		total=sub1+sub2+sub3;        //calculating total
		GradeEx g= new GradeEx();     //creating object
		g.grades(total);              //calling method
		
	}

}

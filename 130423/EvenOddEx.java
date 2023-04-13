/*  Write a program to create thread. Where you will take the input from the user and find if
the number is odd or even.*/
package practicals130423;

import java.util.Scanner;               //importing scanner

class EvenOdd extends Thread           //creating threads
{
	public void run()                    //run method for thread
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no to check if it is even or odd: ");
		int i= sc.nextInt();                        //getting integer input from user
		if(i%2==0)                                  //checking if the number is even or odd
		{
			System.out.println("Given number is even");      //printing output
		}
		else
		{
			System.out.println("Given number is odd");
		}
	}
}
public class EvenOddEx {           

	public static void main(String[] args) {             //main method
		EvenOdd eo=new EvenOdd();                  //creating new thread
		eo.start();                                //starting thread
	}

}

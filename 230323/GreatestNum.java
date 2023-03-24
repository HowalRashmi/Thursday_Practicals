//write a program to take 3 numbers and find the greatest of all 3 numbers
class GreatestNum   //creating class
{
	public static void main(String args[])   //main method
	{
		int a=10,b=10,c=9;  //data members
		if (a>b && a>c)   //if condition to check if a is greater
		{
			System.out.println("A is the greatest number");   //printing output
		}
		else if (b>c)   //else if condition to check  if b is greater
		{
			System.out.println("B is the greatest number");  //printing output
		}
		else   //when a and b both are not greater that is c is the greater
		{
			System.out.println("C is the greatest number");  //printing output
		}
	}
}
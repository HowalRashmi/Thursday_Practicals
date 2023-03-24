/*create a class calculation, which will have add,
substract and multiplication methods.  Create another class where you 
will call all the methods and show output*/

class Calculations   //creating class
{
	int a, b, sum, subtract, multiple;   //data members
	void getAddition(int x, int y)      //creating method for addition
	{
		this.a=x;
		this.b=y;
		System.out.println("Addition is: "+(x+y));
	}
	void getSubtraction(int x,int y)   //creating method for subtraction
	{
		this.a=x;
		this.b=y;
		System.out.println("Subtraction is: "+(x-y));
	}
	void getMultiplication(int x, int y)  //creating method for multiplication
	{
		this.a=x;
		this.b=y;
		System.out.println("Multiplication is: "+(x*y));
	}
}

public class Calculation      //creating public class
{
	public static void main(String args[])   //main method
	{
		Calculations c1=new Calculations();     //creating objects
		Calculations c2=new Calculations();
		Calculations c3=new Calculations();
		c1.getAddition(10,20);          //calling methods 
		c2.getSubtraction(20,10);      
		c3.getMultiplication(10,20);   		
	}
}

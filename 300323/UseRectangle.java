/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize length and 
breadth of the rectangle.
Print the area and perimeter of a rectangle*/
import java.util.Scanner;      //importing Scanner
class Rectangle             //creating class
{
	int l, b;           //data members
	public void Area()         //method to calculate area of rectangle
	{
		System.out.println("Area of Rectangle is: "+(l*b));       //printing output
	}
	public void Peri()         //method to caluclate perimeter of rectangle
	{
		System.out.println("Perimeter of rectangle is: "+((2*l)+(2*b)));       //printing output
	}
	Rectangle()           	//no-arg constructor
	{
		this.l=10;              //initializing length and breadth
		this.b=5;
		
	}
	Rectangle(int l, int b)            //parameterized constructor
	{
		this.l=l;
		this.b=b;
	}
	
}
class UseRectangle         //class with main method
{
	public static void main(String args[])         //main method
	{
		Scanner sc= new Scanner(System.in);
		Rectangle r1= new Rectangle();        //creating object of no-arg constructor
		r1.Area();                  
		r1.Peri();            //calling methods
		System.out.println("Enter length and breadth of rectangle");          
		int l= sc.nextInt();        //getting length and breadth from user
		int b= sc.nextInt();
		Rectangle r2= new Rectangle(l,b);       //creating object of parametrized constructor
		r2.Area();            //calling methods
		r2.Peri();
	}
}

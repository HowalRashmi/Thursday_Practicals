/* Create an abstract class called "Shape" with an abstract method called "calculateArea". 
Create two subclasses called "Circle" and "Rectangle" that inherit from Shape and implement
the "calculateArea" method. Create objects of both the Circle and Rectangle classes 
and call their respective "calculateArea" methods.*/
package pack2;
import java.util.Scanner;
abstract class Shape
{
	abstract void calculateArea();
}

class Circle extends Shape
{
	public void calculateArea()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int r=s.nextInt();
		System.out.println("Area of circle is: "+(3.14*r*r)); 
		
	}
}
class Rectangle extends Shape
{
	public void calculateArea()
	{
		int l,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle");
		l=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Area of rectangle is: "+(l*b));
		
	}
}

public class UseMethod
{
	public static void main(String args[])
	{
		Circle c1= new Circle();
		c1.calculateArea();
		Rectangle r1= new Rectangle();
		r1.calculateArea();
	}
}

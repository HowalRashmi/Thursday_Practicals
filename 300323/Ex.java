/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a 
method called "drive". Create a child class called "Car" that inherits from Vehicle and has 
an additional attribute called "color" and a method called "Type". Create an object of the 
Car class and call both the "drive" and "Type" methods*/
class Vehical        //creating class
{
	String brand;                //data members
	String model;
	int year;
	public void drive()         //creating method drive
	{
		System.out.println("This is drive method of class vehical");     //printing output
	}
}

class Car extends Vehical        //class car is a inherited class of class vehical
{
	String color;                //data members
	public void type()          //creating method type
	{
		System.out.println("This is type method of class car");         //printing output
	}
}

public class Ex           //class with main method
{
	public static void main(String args[])      //main method
	{
		Car c1= new Car();     //creating object of child class car
		c1.drive();            //calling methods
		c1.type();
	}
}

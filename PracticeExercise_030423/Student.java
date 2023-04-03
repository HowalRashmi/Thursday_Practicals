/* Create a parent class called "Person" with attributes such as name, age, and a method 
called "speak". Create a child class called "Student" that inherits from Person 
and has an additional attribute called "grade" and a method called "study". 
Create an object of the Student class and call both the "speak" and "study" methods.*/

package pack2;

class Person
{
	String name="XYZ";
	int age=20;
	public void speak()
	{
		System.out.println("This is speak method of parent class Person");
		System.out.println("Name: "+name+" Age: "+age);
	}
}
public class Student extends Person
{
	String grade='A';
	public void study()
	{
		System.out.println("This is study method of child class Student");
		System.out.println("Grade: "+grade);
	}
	public static void main(String[] args)
	{
		Student s1= new Student();
		s1.speak();
		s1.study();
	}

}

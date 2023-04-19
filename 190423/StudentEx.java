/* Write a program to print the names of students by creating a Student class. If no 
 name is passed while creating an object of Student class, then the name should be
 "Unknown", otherwise the name should be equal to the String value passed while creating 
 object of Student class.*/
package practicals130423;

class Student
{
	String name;     //data member
	Student()      //creating no-arg constructor
	{
		this.name="Unknown";         //setting default value 
		System.out.println(name);   //printing output
	}
	Student(String name)    //creating a parameterized constructor
	{
		this.name=name;        //initializing the data member with the value being passed by the constructor
		System.out.println(name);     //printing output
	}
}
public class StudentEx {

	
	public static void main(String[] args) {    //main method
		Student s1= new Student();          //creating object of a no-arg constructor
		Student s2= new Student("ABC");     //creating object of a parameterized constructor and passing the values 
	}

}

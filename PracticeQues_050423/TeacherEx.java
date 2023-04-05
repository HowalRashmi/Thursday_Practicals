/* Create an interface called ""Person"" with a method called ""speak"".
 Create two classes called ""Student"" and "Teacher" that implement the 
 Person interface and implement the "speak"method. Create objects of both 
 the Student and Teacher classes and call their respective ""speak"" methods.*/
package Practicals050423;

interface Person    //creating interface
{
	public void speak();   //abstract method
}
class Student implements Person    //class implements interface
{
	public void speak()     //giving body to abstract methods
	{
		System.out.println("This is speak method of Student class");
	}
}
public class TeacherEx implements Person   //class implements interface
{
	public void speak()     //giving body to abstract methods
	{
		System.out.println("This is speak method of Teacher class");
	}
	public static void main(String[] args)  //main method
	{
		Student s1= new Student();    //creating objects
		TeacherEx t1= new TeacherEx();
		s1.speak();    //calling respective methods of classes
		t1.speak();



	}

}

/* write a program using constructor. create a class Person with Id, Name, Designation.
 Ask the user what are his inputs and according to that call the constructor */
package strings;
import java.util.Scanner;     //importing scanner
public class Person {
	int id;
	String name;        //data members
	String designation;
	Person()         //no-argument constructor
	{
		this.id=100;
		this.name="ABC";
		this.designation="Marketing";
		System.out.println("ID: "+id+"  Name: "+name+"  Designation: "+designation);
	}
	Person(int id)    //parameterized constructor
	{		
		this.id=id;
		this.name="XYZ";
		this.designation="Sales";
		System.out.println("ID: "+id+"  Name: "+name+"  Designation: "+designation);
	}
	Person(String name)        //parameterized constructor
	{		
		this.id=100;
		this.name=name;
		this.designation="Sales";
		System.out.println("ID: "+id+"  Name: "+name+"  Designation: "+designation);
	}	
	Person(int id, String name)          //parameterized constructor
	{
		this.id=id;
		this.name=name;
		this.designation="Marketing";
		System.out.println("ID: "+id+"  Name: "+name+"  Designation: "+designation);
	}
	Person(String designation,int id)        //parameterized constructor
	{
		this.id=id;
		this.name="ABC";
		this.designation=designation;
		System.out.println("ID: "+id+"  Name: "+name+"  Designation: "+designation);
	} 
	Person(String name, String designation)       //parameterized constructor
	{
		this.id=101;
		this.name=name;
		this.designation=designation;
		System.out.println("ID: "+id+"  Name: "+name+"  Designation: "+designation);
	}
	Person(int id, String name, String designation)        //parameterized constructor
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		System.out.println("ID: "+id+"  Name: "+name+"  Designation"+designation);
	}
	public static void main(String[] args)   //main method
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice: \n1. Enter id only\n2. Enter name only\n"
				+ "3. Enter id and name: \n4. Enter designation and id\n"
				+ "5. Enter name and designation\n6. Enter id, name and designation\n"
				+ "7. Print default values");
		int i=sc.nextInt();        //user input for choice
		if(i==1)                   //checking condition of user input
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your id: ");
			int id= s.nextInt();
			Person p1=new Person(id);
		}
		else if(i==2)         //calling constructor as per the choice
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your name");			
			String name=s.next();
			Person p2=new Person(name);
		}
		else if(i==3)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your id and name");
			int id= s.nextInt();
			String name=s.next();
			Person p3=new Person(id, name);
		}
		else if(i==4)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your designation and id");
			String designation=s.next();
			int id=s.nextInt();
			Person p4=new Person(designation,id);
		}
		else if(i==5)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your name and designation");			
			String name=s.next();
			String designation=s.next();
			Person p5=new Person(name, designation);
		}
		else if(i==6)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your id, name and designation");
			int id= s.nextInt();
			String name=s.next();
			String designation=s.next();
			Person p6=new Person(id, name, designation);
		}
		else if(i==7)
		{
			Person p7= new Person();
		}
		else
		{
			System.out.println("Wrong Input!!");
		}

	}

}

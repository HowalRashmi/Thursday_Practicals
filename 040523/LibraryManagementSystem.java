/* Create a JDBC project for Library Management system(Bookid(PK), BookName(Not Null), 
AuthorName(Not Null))
The project should have following methods 
1. Create method to create new table in the database
2. Add method to add new data to the table
3. Delete method to delete the data from the table based on bookid
4. Update method to update data in the table based on bookid
5. select method to view all the data in the table.
Give choice to the user and execute as per his choice.*/

package com.jdbcproject.lmsproject;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LibraryManagementSystem {
	Scanner sc=new Scanner(System.in);
	public void createtable()     //method for creating table in database
	{
		String url="jdbc:mysql://localhost:3306/lms";       //making connection with the database
		String username="root";
		String password="mySqlrashmi@18";
		try
		{
		Connection con=DriverManager.getConnection(url, username, password);		//establishing connection
		String q="create table LibraryManagement(bookid int primary key, bookname varchar(50) not null," 
				+"Authorname varchar(50) not null)";       //query to create table in the database
		Statement stmt=con.createStatement();    //creating statement
		stmt.executeUpdate(q);       //executing the query and updating database
		System.out.println("Table created successfully!!");		
		}
		catch(Exception e)      //if exception occurs will be catch by catch block
    	{ 
    		System.out.println(e);       //printing the exception
    	}
	}
	public void insert()
	{
		String url="jdbc:mysql://localhost:3306/lms";       //making connection with the database
		String username="root";
		String password="mySqlrashmi@18";
		try
		{
		Connection con=DriverManager.getConnection(url, username, password);		//establishing connection
		String q="insert into LibraryManagement values(?,?,?)";  //query to insert values into the table
		System.out.println("Enter Book id: ");
		int bookid=sc.nextInt();   //getting the book id
		System.out.println("Enter Book Name: ");
		String bname=sc.next();    //getting book name
		System.out.println("Enter Author Name:");
		String aname=sc.next();    //getting author name
		PreparedStatement pstmt= con.prepareStatement(q);
		pstmt.setInt(1, bookid);      
		pstmt.setString(2, bname);
		pstmt.setString(3, aname);
		pstmt.executeUpdate();   //updating database after inserting data
		System.out.println("Data Inserted Successfully!!");
		}
		catch(Exception e)      //if exception occurs will be catch by catch block
    	{ 
    		System.out.println(e);       //printing the exception
    	}
	}
	public void delete()
	{
		String url="jdbc:mysql://localhost:3306/lms";       //making connection with the database
		String username="root";
		String password="mySqlrashmi@18";
		try
		{
		Connection con=DriverManager.getConnection(url, username, password);		//establishing connection
		String q="delete from LibraryManagement where bookid=?";    //delete data from table based on book id
		System.out.println("Enter Book id: ");
		int bookid=sc.nextInt();   //book id which data should be deleted
		PreparedStatement pstmt=con.prepareStatement(q);
		pstmt.setInt(1, bookid);
		pstmt.executeUpdate();    //updating database after deletion
		System.out.println("Data Deleted Successfully!!");
		}
		catch(Exception e)      //if exception occurs will be catch by catch block
    	{ 
    		System.out.println(e);       //printing the exception
    	}
	}
	public void updatebname()
	{
		String url="jdbc:mysql://localhost:3306/lms";       //making connection with the database
		String username="root";
		String password="mySqlrashmi@18";
		try
		{
		Connection con=DriverManager.getConnection(url, username, password);		//establishing connection
		String q="update LibraryManagement set bookname=? where bookid=?";    			
		System.out.println("Enter Book id: ");  //book id which data is to be updated
		int bookid=sc.nextInt();  
		System.out.println("Enter Book Name: ");
		String bname=sc.next();    //updating book name based on book id
		PreparedStatement pstmt=con.prepareStatement(q);
		pstmt.setString(1, bname);
		pstmt.setInt(2, bookid);
		pstmt.executeUpdate();   //updating database after updating book name
		System.out.println("Data Updated Successfully!!");
		}
		catch(Exception e)      //if exception occurs will be catch by catch block
    	{ 
    		System.out.println(e);       //printing the exception
    	}
	}
	public void updateaname()
	{
		String url="jdbc:mysql://localhost:3306/lms";       //making connection with the database
		String username="root";
		String password="mySqlrashmi@18";
		try
		{
		Connection con=DriverManager.getConnection(url, username, password);		//establishing connection
		String q="update LibraryManagement set Authorname=? where bookid=?";
		System.out.println("Enter Book id: ");    //book id which data is to be updated
		int bookid=sc.nextInt();
		System.out.println("Enter Author Name: ");
		String aname=sc.next();           //updating author name based on book id
		PreparedStatement pstmt=con.prepareStatement(q);
		pstmt.setString(1, aname);
		pstmt.setInt(2, bookid);
		pstmt.executeUpdate();    //updating database after updating author name
		System.out.println("Data Updated Successfully!!");
		}
		catch(Exception e)      //if exception occurs will be catch by catch block
    	{ 
    		System.out.println(e);       //printing the exception
    	}
	}
	public void select()
	{
		String url="jdbc:mysql://localhost:3306/lms";       //making connection with the database
		String username="root";
		String password="mySqlrashmi@18";
		try
		{
		Connection con=DriverManager.getConnection(url, username, password);		//establishing connection
		String q="select * from LibraryManagement";    //query to select all data from table
		Statement stmt = con.createStatement(); 
		ResultSet rs= stmt.executeQuery(q);      //result set for displaying data
		System.out.println("Book id\t\tBook Name\t\tAuthor Name");
		while(rs.next())
		{
			int id = rs.getInt(1);    //retrieving data from the table
			String name = rs.getString(2);
			String aname = rs.getString(3);
			System.out.println(id+"  \t\t"+name+"  \t\t"+aname);  //printing data retrieved from table 
		}
		}
		catch(Exception e)      //if exception occurs will be catch by catch block
    	{ 
    		System.out.println(e);       //printing the exception
    	}
	}

	public static void main(String[] args) {     //main method
		String url="jdbc:mysql://localhost:3306/lms";
    	String username="root";
    	String password="mySqlrashmi@18";
    	try
    	{
    		Connection con= DriverManager.getConnection(url, username, password);    		
    		Scanner sc= new Scanner(System.in);
    		System.out.println("Enter your choice:\n1. Create table\n2. Insert Data\n3. Delete Data using book id\n"
    				+"4. Update Book Name using bookid\n5. Update Author name using bookid\n6. Select Data\n");  //giving choice to the user
    		int i=sc.nextInt();  //getting user's choice
    		if(i==1)
    		{
    			LibraryManagementSystem lms=new LibraryManagementSystem();    //creating object
        		lms.createtable();       //calling method to create table
    		}
    		if(i==2)
    		{
    			LibraryManagementSystem lms=new LibraryManagementSystem();      //creating object
    			lms.insert();      //calling insert method
    		}  
    		if(i==3)
    		{
    			LibraryManagementSystem lms=new LibraryManagementSystem();   //creating object
    			lms.delete();        //calling delete method
    		}
    		else if(i==4)
    		{
    			LibraryManagementSystem lms=new LibraryManagementSystem();      //creating object
    			lms.updatebname();       //calling method update to update book name
    		}
    		else if(i==5)
    		{    			
    			LibraryManagementSystem lms=new LibraryManagementSystem();    //creating object
    			lms.updateaname();      //calling update method to update author name
    		}
    		else if(i==6)
    		{
	    		
	    		LibraryManagementSystem lms=new LibraryManagementSystem();       //creating object
    			lms.select();      //calling method of select query
    		}
    		else
    		{
    			System.out.println("Wrong input");     //if the input is other than that is provided
    			
    		}  		
    		con.close();        //closing the connection
    	}
    	
    	catch(Exception e)      //if exception occurs will be catch by catch block
    	{ 
    		System.out.println(e);       //printing the exception
    	}
    	
	}

}

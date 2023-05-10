package com.jdbcproject.hibernateEx;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity    //annotation to create a table
@Table(name="Student")  //annotation to name the table 
public class Student 
{	
	@Id    //annotation to create a primary key
	private int sid;     //data members
	private String sname; 
	private int sage;
	
	//getter setter methods for the private data members
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	
	
	public Student(int sid, String sname, int sage) {  //parameterized constructor
		super();       //assigning values to the private data members of super class
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	
	
	public Student() {    //no-argument constructor
		super();
	}
	
	
}
//entity file must contain "javax.persistence.x" to be imported
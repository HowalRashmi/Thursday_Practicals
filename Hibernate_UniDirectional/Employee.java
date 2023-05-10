package com.hibernate.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {    //entity class
	
	@Id   //annotation to set eid as primary key 
	private int eid;      //data members
	private String ename;
	
	
	@OneToOne
	private Department dept;      //foreign key
	
	//getter setter methods
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
}

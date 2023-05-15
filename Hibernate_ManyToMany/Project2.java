package com.hibernate.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project2 {

	@Id
	private int pid;
	private String pname;
	
	@ManyToMany(mappedBy="proj")
	private List<Employee3> emp;

	
	//getter setter methods
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee3> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee3> emp) {
		this.emp = emp;
	}

	
	//constructors
	public Project2(int pid, String pname, List<Employee3> emp) {  //parameterized constructor
		super();
		this.pid = pid;
		this.pname = pname;
		this.emp = emp;
	}

	public Project2() {  //no-arg constructor
		super();
		
	}
	
	
	
}

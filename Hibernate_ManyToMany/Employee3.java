package com.hibernate.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Employee3 {

	
	@Id
	private int eid;
	private String ename;
	
	@ManyToMany
	@JoinTable(name="Emp_Project",
	joinColumns= {@JoinColumn(name="eid")},
	inverseJoinColumns= {@JoinColumn(name="pid")})
	private List<Project2> proj;

	
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

	public List<Project2> getProj() {
		return proj;
	}

	public void setProj(List<Project2> proj) {
		this.proj = proj;
	}

	
	//constructors
	public Employee3(int eid, String ename, List<Project2> proj) {  //parameterized constructor
		super();
		this.eid = eid;
		this.ename = ename;
		this.proj = proj;
	}

	public Employee3() { //no-arg constructor
		super();
		
	}
	
	
}

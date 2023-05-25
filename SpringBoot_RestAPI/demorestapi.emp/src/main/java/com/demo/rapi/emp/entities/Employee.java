package com.demo.rapi.emp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

//entity class
@Entity
public class Employee {

	//data members
	//primary key
	@Id
	private int eid;
	private String ename;
	private String edept;
	private String ecity;
	
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
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	
	//parameterized constructor
	public Employee(int eid, String ename, String edept, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.ecity = ecity;
	}
	
	//no-arg constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toString method
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edept=" + edept + ", ecity=" + ecity + "]";
	}
	
	
}

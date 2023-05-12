package com.hibernate.OnetToOneEx;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Table(name="Employee")
public class Employee1 {
	
	@Id
	private int eid;     //data members
	private String ename;
	private String edesignation;
	
	@OneToOne
	private Project proj;   //object of other class

	
	
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

	public String getEdesignation() {
		return edesignation;
	}

	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}
		
	
}

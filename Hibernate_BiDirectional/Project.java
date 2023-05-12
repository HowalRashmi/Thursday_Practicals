package com.hibernate.OnetToOneEx;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Project {    //entity class
	
	@Id
	private int pid;     //data members
	private String pname;
	private String pdescription;
	
	@OneToOne
	private Employee1 emp;   //object of other class

	
	
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

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public Employee1 getEmp() {
		return emp;
	}

	public void setEmp(Employee1 emp) {
		this.emp = emp;
	}
	
	
}

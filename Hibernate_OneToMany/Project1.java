package com.hibernate.OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project1 {   //entity class
	
	//data members
	@Id @Column(name="Project_Id")
	private int pid;
	
	@Column(name="Project_Name")
	private String pname;
	
	@OneToMany(mappedBy="proj")
	private List<Employee2>emp;

	
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

	public List<Employee2> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee2> emp) {
		this.emp = emp;
	}
	
	
}

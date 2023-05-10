package com.hibernate.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {   //entity class
	
	
	@Id
	private int did;      //data members
	private String dname;
	
	
	//getter setter methods
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
		
	
}

package com.hibernate.ManyToMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
import java.util.ArrayList;

public class HibernateManyToMany {

	public static void main(String[] args) {
		
		System.out.println("Project Started!!");
		Configuration cfg= new Configuration();  //creating configuration
		cfg.configure("hibernate.cfg.xml");    //configuring the xml file
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating objects
		Project2 p1= new Project2();
		p1.setPid(101);
		p1.setPname("Hotel Management System");
		
		Project2 p2= new Project2();
		p2.setPid(102);
		p2.setPname("Library Management System");
		
		Project2 p3= new Project2();
		p3.setPid(103);
		p3.setPname("Hospital Management System");
		
		Employee3 e1 = new Employee3();
		e1.setEid(401);
		e1.setEname("Rashmi");
		
		Employee3 e2= new Employee3();
		e2.setEid(402);
		e2.setEname("Pragati");
		
		Employee3 e3= new Employee3();
		e3.setEid(403);
		e3.setEname("Ankita");
		
		//creating lists of projects and employees
		List<Project2> pl1= new ArrayList<Project2>();
		pl1.add(p1);
		pl1.add(p2);
		pl1.add(p3);
		
		List<Project2> pl2= new ArrayList<Project2>();
		pl2.add(p2);
		pl2.add(p3);
		
		List<Project2> pl3= new ArrayList<Project2>();
		pl3.add(p1);
		pl3.add(p2);
		
		List<Employee3> el1= new ArrayList<Employee3>();
		el1.add(e1);
		el1.add(e3);
		
		List<Employee3> el2= new ArrayList<Employee3>();
		el2.add(e2);
		el2.add(e3);
		
		List<Employee3> el3= new ArrayList<Employee3>();
		el3.add(e1);
		el3.add(e2);
		el3.add(e3);
		
		//associating projects and employees
		p1.setEmp(el3);
		p2.setEmp(el1);
		p3.setEmp(el2);
		
		e1.setProj(pl3);
		e2.setProj(pl1);
		e3.setProj(pl2);
		
		Session s= factory.openSession();  
		Transaction tx= s.beginTransaction();
		s.save(e1);   //saving changes
		s.save(e2);
		s.save(e3);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		tx.commit();   //committing changes
		s.close();  //closing session
		factory.close();  //closing session factory
		System.out.println("Completed!!");
	}

}

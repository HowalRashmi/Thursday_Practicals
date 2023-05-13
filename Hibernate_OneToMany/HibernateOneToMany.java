package com.hibernate.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;


public class HibernateOneToMany {

	public static void main(String[] args) {  //main method
		
		System.out.println("Project Started!!");
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		//object for class project
		Project1 p1= new Project1();
		p1.setPid(101);
		p1.setPname("Cloud Based Bus Pass System");
		
		//objects of employee class
		Employee2 e1= new Employee2();
		e1.setEid(201);
		e1.setEname("Rashmi");
		e1.setProj(p1);
		
		Employee2 e2= new Employee2();
		e2.setEid(202);
		e2.setEname("Ankita");
		e2.setProj(p1);
		
		Employee2 e3= new Employee2();
		e3.setEid(203);
		e3.setEname("Pragati");
		e3.setProj(p1);
		
		//creating the list for all the employees with same projects
		List<Employee2> al1=new ArrayList<Employee2>();
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		p1.setEmp(al1);
		
		Session s= factory.openSession();
		Transaction tx= s.beginTransaction();
		s.save(p1); 
		s.save(e1); 
		s.save(e2);
		s.save(e3);
		tx.commit();    //committing changes
		
		s.close();   //closing session 
		factory.close();    //closing session factory
		System.out.println("Completed!!");
	}

}

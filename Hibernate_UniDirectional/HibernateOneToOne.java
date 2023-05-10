package com.hibernate.OneToOne;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOneToOne {     

	public static void main(String[] args) {     //main method
		
		System.out.println("Project started!!");
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");      //configuring xml file
		SessionFactory factory= cfg.buildSessionFactory();    //creating object of session factory
				
		
		
		Department d1= new Department();
		d1.setDid(201);
		d1.setDname("Marketing");
		
		Department d2= new Department();
		d2.setDid(202);
		d2.setDname("Sales");
		
		Department d3=new Department();
		d3.setDid(103);
		d3.setDname("Finance");
		
		Employee e1= new Employee();
		e1.setEid(101);
		e1.setEname("Rashmi");
		e1.setDept(d3);
		
		Employee e2= new Employee();
		e2.setEid(102);
		e2.setEname("Kranti");
		e2.setDept(d1);
		
		Employee e3= new Employee();
		e3.setEid(103);
		e3.setEname("Aboli");
		e3.setDept(d2);
		
		
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(d1);
		session.save(d2);
		session.save(d3);
		tx.commit();    //committing the changes
		session.close();
		factory.close();
		System.out.println("Completed!!");
	}

}

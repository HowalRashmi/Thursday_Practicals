package com.hibernate.OnetToOneEx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneBidirectional {

	public static void main(String[] args) {  //main method
		
		System.out.println("Project Started!!");
		Configuration cfg= new Configuration();    //creating configuration
		cfg.configure("hibernate.cfg.xml");    //configuring xml file
		SessionFactory factory= cfg.buildSessionFactory();    //building the session factory
		
		
		//inserting the employee data into the table
		Employee1 e1= new Employee1();
		e1.setEid(1001);              
		e1.setEname("Rashmi");
		e1.setEdesignation("Project-Manager");
		
		Employee1 e2= new Employee1();
		e2.setEid(1002);
		e2.setEname("Kranti");
		e2.setEdesignation("Assistant_Project_Manager");
		
		Employee1 e3= new Employee1();
		e3.setEid(1003);
		e3.setEname("Aboli");
		e3.setEdesignation("Project_Co-Ordinator");
		
		
		//inserting project info into the table
		Project p1= new Project();    
		p1.setPid(2001);
		p1.setPname("Cloud_Based_Bus_Pass_System");      
		p1.setPdescription("BusPass-Stored-on-cloud");
		p1.setEmp(e1);
		
		Project p2= new Project();
		p2.setPid(2002);
		p2.setPname("BCT_for_Health");
		p2.setPdescription("Helps-diagnose-provide-treatments");
		p2.setEmp(e3);
		
		Project p3= new Project();
		p3.setPid(2003);
		p3.setPname("Image_Recognition_For_Attendence");
		p3.setPdescription("Works_Similar-Biometric-attendence");
		p3.setEmp(e2);
		
		e1.setProj(p1);
		e2.setProj(p3);
		e3.setProj(p2);
		
		Session s= factory.openSession();  //opening session
		Transaction tx=s.beginTransaction();
		s.save(e1);     //saving the data
		s.save(e2);
		s.save(e3);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		tx.commit();    //committing the transaction
		s.close();    //closing the session
		factory.close();      //closing session factory
		System.out.println("Completed!!");
		
	}

}

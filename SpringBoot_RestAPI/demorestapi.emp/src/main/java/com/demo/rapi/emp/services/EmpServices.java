package com.demo.rapi.emp.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.demo.rapi.emp.entities.Employee;

@Component
public class EmpServices {

	//creating list of employees
	private static List<Employee> emplist=new ArrayList<>();
	static
	{
		emplist.add(new Employee(201, "A", "HR", "Chennai"));
		emplist.add(new Employee(202, "B", "Sales", "Mumbai"));
		emplist.add(new Employee(203, "C", "Marketing", "Nagpur"));
		emplist.add(new Employee(204, "D", "Councelling", "Pune"));
		emplist.add(new Employee(205, "E", "Marketing", "Solapur"));
	}
	
	//using get method
	public List<Employee> getEmp()
	{
		return emplist;
	}
	
	public Employee getEmpById(int id)
	{
		Employee emp= null;
		try
		{
			emp=emplist.stream().filter(e-> e.getEid()==id).findFirst().get();
			return emp;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return emp;  
		}
	}
	//put method
	public void updateEmp(Employee emp, int id)
	{
		emplist=emplist.stream().map(e->
		{
			if(e.getEid()==id)
			{
				e.setEname(emp.getEname());
				e.setEdept(emp.getEdept());
				e.setEcity(emp.getEcity());
			}
			return e;
		}).collect(Collectors.toList());
	}
	
	//post method
	public Employee addEmp(Employee e)
	{
		emplist.add(e);
		return e;
	}
	
	//delete method
	public void deleteEmp(int id)
	{
		emplist=emplist.stream().filter(e-> e.getEid()!=id).collect(Collectors.toList());
	}
}

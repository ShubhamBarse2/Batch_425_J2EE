package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Department d = new Department();
		d.setDeptName("HR");

		Employee e1 = new Employee();
		e1.setEmpId(1114);
		e1.setEmpName("Praful");
		e1.setCity("goa");
		e1.setDept(d);

		Employee e2 = new Employee();
		e2.setEmpId(1115);
		e2.setEmpName("Ram");
		e2.setCity("akola");
		e2.setDept(d);

		Employee e3 = new Employee();
		e3.setEmpId(1116);
		e3.setEmpName("riya");
		e3.setCity("chandrapur");
		e3.setDept(d);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		ss.persist(d);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);
		d.setEmp(list);

		System.out.println("Data is inserted...!");

		tr.commit();
		ss.close();

	}
}

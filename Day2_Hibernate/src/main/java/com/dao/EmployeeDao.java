package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class EmployeeDao {

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setName("raj");
		e.setCity("goa");
		e.setEmail("raj@gmail.com");
		e.setSalary(35000);

		ss.save(e);
//		ss.persist(e);

		tr.commit();
		ss.close();
		System.out.println("Data is Inserted ... !");
	}

	public void deleteData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 6;
		Employee e1 = ss.get(Employee.class, id);

//		ss.delete(e1);
		ss.remove(e1);
		System.out.println("Data is deleted ... !");

		tr.commit();
		ss.close();

	}

	public void updateData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Employee e1 = ss.get(Employee.class, id);
		e1.setName("OM");
		e1.setCity("nsk");
		e1.setEmail("om@gmail.com");
		e1.setSalary(56000);

//             ss.update(e1);     
		ss.merge(e1);

//			
		System.out.println("Data is updated ... !");

		tr.commit();
		ss.close();

	}

	public void getSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Employee e1 = ss.get(Employee.class, id);
		System.out.println(e1);
		
//		Employee e2 = ss.load(Employee.class, id);
//		System.out.println(e2);

		tr.commit();
		ss.close();
		

	}
}

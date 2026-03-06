package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class GetSingleRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// select * from employee where id = 3;

//		String hqlQuery = "from Employee where empid =: empid";
//		org.hibernate.query.Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
//		query.setParameter("empid", 3);
//		Employee e = query.uniqueResult();
//		System.out.println(e);

		
		
//		String hqlQuery = "from Employee where id =: id";
//		Query query1 = ss.createQuery(hqlQuery, Employee.class);
//		query1.setParameter("id", 3);
//		Employee e1 = (Employee) query1.getSingleResult();
//		System.out.println(e1);

		tr.commit();
		ss.close();

	}
}

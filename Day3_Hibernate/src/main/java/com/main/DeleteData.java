package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Employee;

public class DeleteData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// delete from Student wheere id = 67;

		String hqlQuery = "delete from Employee where id=:id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("id", 3);
		query.executeUpdate();

		System.out.println("Data is deleted...!");

		tr.commit();
		ss.close();

	}
}

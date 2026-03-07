package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Laptop;
import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Laptop.class);
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Laptop l = new Laptop();
		l.setLaptopId(3);
		l.setName("asus");
		ss.persist(l);

		Student s = new Student();
		s.setStudId(113);
		s.setName("shyam");
		s.setCity("nsk");
		s.setLaptop(l);

		ss.persist(s);

		System.out.println("Data is inserted...!");

		tr.commit();
		ss.close();

	}
}

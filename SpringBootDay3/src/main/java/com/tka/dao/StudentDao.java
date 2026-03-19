package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entities.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Student s) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		session.persist(s);
		session.close();
		tr.commit();

		return "Data is inserted...";

	}

	public String deleteData(int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Student s = session.get(Student.class, id);
		session.remove(s);
		session.close();
		tr.commit();

		return "Data is deleted...";

	}

	public String updateData(Student s, int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Student std = session.get(Student.class, id);
		std.setName(s.getName());
		std.setCity(s.getCity());
		std.setMarks(s.getMarks());
		session.merge(std);
		session.close();
		tr.commit();

		return "Data is updated...";

	}

	public List<Student> getAllData() {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		String hqlQuery = "from Student";
		Query<Student> query = session.createQuery(hqlQuery);
		List<Student> list = query.getResultList();
		session.close();
		tr.commit();

		return list;

	}

	public Student getSingleRecord(int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		String hqlQuery = "from Student where id =: id";
		Query<Student> query = session.createQuery(hqlQuery);
		query.setParameter("id", id);
		Student s1 = query.getSingleResult();
		session.close();
		tr.commit();

		return s1;

	}

}

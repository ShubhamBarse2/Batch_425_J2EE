package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entities.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public String insertData(Student s) {
		String msg = dao.insertData(s);
		return msg;

	}

	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}

	public String updateData(Student s, int id) {
		String msg = dao.updateData(s, id);
		return msg;
	}

	public List<Student> getAllData() {
		List<Student> list = dao.getAllData();
		return list;
	}

	public Student getSingleData(int id) {
		Student s1 = dao.getSingleRecord(id);
		return s1;
	}
}

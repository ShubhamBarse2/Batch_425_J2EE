package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {

	public void insertData() {
		EmployeeDao dao = new EmployeeDao();
		dao.insertData();

	}

	public void deleteData() {
		EmployeeDao dao = new EmployeeDao();
		dao.deleteData();
	}

	public void updateData() {
		EmployeeDao dao = new EmployeeDao();
		dao.updateData();
	}

	public void getSingleRecord() {
		EmployeeDao dao = new EmployeeDao();
		dao.getSingleRecord();

	}

}

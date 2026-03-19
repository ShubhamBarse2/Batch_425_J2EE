package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entities.Student;
import com.tka.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/addstudent")
	public String insertData(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}

	@DeleteMapping("/removestd/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@PutMapping("/updatestd/{id}")
	public String updateData(@RequestBody Student s, @PathVariable int id) {
		String msg = service.updateData(s, id);
		return msg;
	}

	@GetMapping("/fetchData")
	public List<Student> getAllData() {
		List<Student> list = service.getAllData();
		return list;
	}

	@GetMapping("/singleRecord")
	public Student getSingleData(@RequestParam int id) {
		Student s1 = service.getSingleData(id);
		return s1;
	}

}

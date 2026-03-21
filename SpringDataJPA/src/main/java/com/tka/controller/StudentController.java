package com.tka.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Student;
import com.tka.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/add")
	public String insertData(@RequestBody Student s) {
		return service.insertData(s);
	}

	@GetMapping("/all")
	public List<Student> getAllData() {
		return service.getAllData();
	}

	@GetMapping("/getsingle/{studId}")
	public Optional<Student> getSingleData(@PathVariable int studId) {
		return service.getSingleData(studId);
	}

	@DeleteMapping("/dlt")
	public String deleteData(@RequestParam int id) {
		return service.deleteData(id);
	}

	@PutMapping("/updateProfile/{id}")
	public String updateData(@RequestBody Student s, @PathVariable int id) {
		return service.updateData(s, id);
	}

}

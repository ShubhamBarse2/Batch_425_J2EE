package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // --> getr setr , hashcode , toString
@NoArgsConstructor
//@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studId;
	String name;
	String email;
	String city;
	double marks;

	public Student(String name, String email, String city, double marks) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.marks = marks;
	}

}

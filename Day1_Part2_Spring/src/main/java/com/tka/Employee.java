package com.tka;

public class Employee {

	int id;
	String name;
	String city;

	Country con;

	public Employee() {

	}

	public Employee(int id, String name, String city, Country con) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.con = con;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", con=" + con + "]";
	}

}

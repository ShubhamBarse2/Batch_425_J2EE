package com.tka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Value("+91")
	int conId;
	@Value("IND")
	String name;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int conId, String name) {
		super();
		this.conId = conId;
		this.name = name;
	}

	public int getConId() {
		return conId;
	}

	public void setConId(int conId) {
		this.conId = conId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [conId=" + conId + ", name=" + name + "]";
	}

}

package com.tka;

import org.springframework.stereotype.Component;

@Component("Jio")
public class Jio implements Sim {

	@Override
	public String calling() {
		return "U R Calling Jio";
	}

}

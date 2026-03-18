package com.tka;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3School")
public class MyController {

	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public String firstApi() {
		return "java is OOPs language ";
	}

	@PostMapping("/html")
	public String secondApi() {
		return "html stand for hypertext markup language ";
	}

	@PutMapping("/python")
	public String thirdApi() {
		return "python easily used with AI ML";
	}

	@DeleteMapping("/js")
	public String fourthApi() {
		return "js stand for javascript";
	}

}

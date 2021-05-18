package com.stacksimplify.restservices.springbootbuildingblocks.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller 
@RestController
public class HelloWorldController {

	//Simple Method 
	//URI - To make it accessible in REST /helloworld
	//Method to access it from rest clinet like postman or browser - GET method - 2 ways to implment GET - Getmapping and request mapping
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld9")
	public String helloWorld() {
		return "hello world";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Gayatri", "Jagannathan", "Pondicherry");
	}
}

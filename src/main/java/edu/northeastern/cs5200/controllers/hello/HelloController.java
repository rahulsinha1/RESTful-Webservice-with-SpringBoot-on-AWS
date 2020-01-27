package edu.northeastern.cs5200.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/api/hello/string")
	public String sayHello() {
		return "Rahul Sinha!";
	}
	
	@RequestMapping("/api/hello/object")
	public HelloObject sayHelloObject() {
		HelloObject obj = new HelloObject("Hello Rahul Sinha!");
		return obj;
	}

}

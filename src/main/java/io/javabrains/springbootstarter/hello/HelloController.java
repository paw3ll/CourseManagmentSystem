package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	//Methods inside of controller map to URL requests.
	
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}
}

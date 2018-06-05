package net.study.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayhello(){
		System.out.println("-------HelloController.sayhello()---------");
		return "hello";
	}
}

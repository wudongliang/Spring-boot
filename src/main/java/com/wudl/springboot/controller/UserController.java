package com.wudl.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	

	@RequestMapping("/getstr")
	public String getStr()
	{
		return "helloworld";
	}
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class DataController {
	@PostMapping
	public String accpetData(@RequestParam String name,@RequestParam int sub1,@RequestParam int sub2,@RequestParam int sub3,@RequestParam int sub4,@RequestParam int sub5)
	
	{
		int result=(sub1+sub2+sub3+sub4+sub5)/5;
		return "Hey "+name+" your percentage is "+result;
	}

}

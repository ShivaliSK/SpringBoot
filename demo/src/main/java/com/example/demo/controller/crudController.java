package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Student;

@RestController
@RequestMapping("/crud")

public class crudController {
	@GetMapping(value="{id}")
	public Student getInfo(@PathVariable String id)
	{
		Student s1=new Student(id, "suresh");
		return s1;
		
	}

}

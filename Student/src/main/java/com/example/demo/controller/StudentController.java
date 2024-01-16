package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.StudentService;

@Controller

public class StudentController {
	@Autowired
	StudentService studentservice;
	@GetMapping("/crud")
	String getAllStudents(Model model)
	{
		model.addAttribute("students",studentservice.getAllStudents());
		return "view-students";
	}

}

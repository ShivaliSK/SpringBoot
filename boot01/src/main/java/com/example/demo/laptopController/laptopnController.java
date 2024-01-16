package com.example.demo.laptopController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;
@RestController
@RequestMapping("/laptop")
public class laptopnController {
	Laptop laptop;
	@GetMapping(value="{serialNumber}")
	public Laptop readLaptop(@PathVariable String serialNumber)
	{
		return laptop;
	}
	@PostMapping()
	public String createLaptop(@RequestBody Laptop laptop)
	{
		this.laptop=laptop;
		return "Created Successfully";
		
	}
	
	@PutMapping
	public String updateLaptop(@RequestBody Laptop laptop)
	{
		this.laptop=laptop;
		return "Updated successfully";
		
		
	}
	@DeleteMapping(value="{serialNumber}")
	public String deleteLaptop(@PathVariable String serialNumber)
	{
		laptop=null;
		
		return "Deleted Successfully";
		
	}

}

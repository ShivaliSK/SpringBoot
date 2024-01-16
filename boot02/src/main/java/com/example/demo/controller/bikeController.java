package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.demo.entity.Bike;
import com.example.demo.service.BikeService;


@RestController
@RequestMapping("/crud")



public class bikeController {
	BikeService bikeInterface;
	
	
	public bikeController(BikeService bikeInterface) {
		super();
		this.bikeInterface = bikeInterface;
	}


	@PostMapping

	public Bike createBike(@RequestBody Bike bike)
	{
		return bikeInterface.createBike( bike);
		
	}
	@GetMapping("{regNumber}")
	public Bike readBikeByReg(@PathVariable String regNumber)
	{
		return bikeInterface.readBikeByReg(regNumber);
		
	}
	@GetMapping
	public List<Bike> getAllBike()
	{
		List<Bike> b1=bikeInterface.readAllBike();
		return b1;
	}
	@PutMapping
	public Bike updateBike(@RequestBody Bike bike)
	{
		return bikeInterface.updateBike(bike);
	}
	@DeleteMapping("{regNumber}")
	public String delete(@PathVariable String regNumber)
	{
		String msg=bikeInterface.delete(regNumber);
		return msg;
	}
	
	

}

package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;

@Service

public interface BikeService {
	Bike createBike(Bike bike);
	
	Bike readBikeByReg(String regNum);
	
	List<Bike> readAllBike();
	
	Bike updateBike(Bike bike);
	
	String delete(String regNum);
	
	

}

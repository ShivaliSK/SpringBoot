package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;
@Service

public class BikeServiceImpl implements BikeService {
	BikeRepository bikerepo;
	

	

	public BikeServiceImpl(BikeRepository bikerepo) {
		super();
		this.bikerepo = bikerepo;
	}

	@Override
	public Bike createBike(Bike bike) {
		// TODO Auto-generated method stub
		bikerepo.save(bike);
		return bikerepo.save(bike);
	}

	@Override
	public Bike readBikeByReg(String regNum) {
		// TODO Auto-generated method stub
		Bike b1=bikerepo.findById(regNum).get();
		return b1;
	}

	@Override
	public List<Bike> readAllBike() {
		// TODO Auto-generated method stub
		List<Bike> bikeList=bikerepo.findAll();
		return bikeList;
	}
	@Override
	public Bike updateBike(Bike bike) {
		// TODO Auto-generated method stub
		return bikerepo.save(bike);
	}

	

	@Override
	public String delete(String regNum) {
		// TODO Auto-generated method stub
		bikerepo.deleteById(regNum);
		return "Bike deleted";
	}

	
	
	

}

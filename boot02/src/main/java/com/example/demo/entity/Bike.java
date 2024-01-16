package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	String regNum;
	String manufacturer;
	double cost;
	public Bike() {
		super();
	}
	public Bike(String regNum, String manufacturer, double cost) {
		super();
		this.regNum = regNum;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [regNum=" + regNum + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}
	

}

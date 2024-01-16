package com.example.demo.entity;

public class Laptop {
String serialNum;
String company;
double price;

public Laptop() {
	super();
}

public Laptop(String serialNum, String company, double price) {
	super();
	this.serialNum = serialNum;
	this.company = company;
	this.price = price;
}

public String getSerialNum() {
	return serialNum;
}

public void setSerialNum(String serialNum) {
	this.serialNum = serialNum;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Laptop [serialNum=" + serialNum + ", company=" + company + ", price=" + price + "]";
}


}

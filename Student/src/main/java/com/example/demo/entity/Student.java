package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int rollnum;
	String name;
	int marks;
	
	public Student() {
		super();
	}

	public Student(int rollnum, String name, int marks) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.marks = marks;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

}

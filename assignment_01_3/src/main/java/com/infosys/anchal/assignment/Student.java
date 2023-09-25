package com.infosys.anchal.assignment;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Student {
	private int id;
	private String name;
	private String rno;
	private List<Course> courses = new ArrayList<>();
	
	public Student(int id, String name, String rno, List<Course>courses) {
		this.id = id;
		this.name = name;
		this.rno = rno;
		this.courses = courses;
	}
}

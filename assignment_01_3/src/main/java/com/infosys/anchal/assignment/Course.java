package com.infosys.anchal.assignment;

import lombok.Data;

@Data
public class Course {
	private int id;
	private String name;
	
	public Course(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

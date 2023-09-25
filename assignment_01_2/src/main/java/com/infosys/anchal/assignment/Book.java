package com.infosys.anchal.assignment;

import lombok.Data;

@Data
public class Book {
	private int id;
	private String title;
	private String author;
	
	public Book() {};
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
}
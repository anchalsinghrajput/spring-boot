package com.infosys.anchal.assignment;

import java.util.List;

public class LibraryService {
	private List<Book> books;
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	 public void displayBooks() {
	        System.out.println("List of Books: ");
	        for (Book book : books) {
	            System.out.println("ID: " + book.getId() + "\n Title: " + book.getTitle() + "\n Author: " + book.getAuthor());
	        }
	    }
}

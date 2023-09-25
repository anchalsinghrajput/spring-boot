package com.infosys.anchal.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.infosys.anchal.beans.Books;

@Configuration
public class Config {
	
	@Primary
	@Bean(name="myBook")
	Books getBooksObject() {
		Books b = new Books();
		b.setBookId(10);
		b.setBookName("It end with us");
		return b;
	}
	
	@Bean(name="childrenBook")
	Books getBooksObject1() {
		Books b = new Books();
		b.setBookId(11);
		b.setBookName("Harry Potter");
		return b;
	}

}

package com.infosys.anchal.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String personName;
	@Autowired
	Laptop laptop;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public void getDetails() {
		System.out.println("Person purchased the laptop"+ personName);
		System.out.println("Latop model purched : " +laptop.getLaptopName());
		
	}
}

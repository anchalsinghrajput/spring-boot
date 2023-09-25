package com.infosys.anchal.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.infosys.anchal.beans.Employee;

@Configuration
public class Config {
	
	@Bean
	Employee getEmployee() {
		Employee e = new Employee();
		e.setEmpId(10);
		e.setEmpName("Anchal");
		return e;
	}
	
	@Bean
	Employee getEmployee1() {
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Ankit");
		return e;
	}
	
	@Bean
	Employee getEmployee2() {
		Employee e = new Employee();
		e.setEmpId(12);
		e.setEmpName("singh");
		return e;
	}
	
	@Bean
	String HelloClass() {
		return "Hello class";
	}
	
//	=== custom bean
	
	@Bean(name="myEmployee")
	Employee getEmployee3() {
		Employee e = new Employee();
		e.setEmpId(14);
		e.setEmpName("muskan");
		return e;
	}
	
	@Bean(value="hellorajveer")
	Employee getEmployee4() {
		Employee e = new Employee();
		e.setEmpId(15);
		e.setEmpName("rajveer");
		return e;
	}	
}

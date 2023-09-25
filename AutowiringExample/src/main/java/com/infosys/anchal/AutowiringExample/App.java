package com.infosys.anchal.AutowiringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.anchal.beans.Person;
import com.infosys.anchal.config.Config;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person p = context.getBean(Person.class);
        p.setPersonName("anchal");
        p.getDetails();
    }
}

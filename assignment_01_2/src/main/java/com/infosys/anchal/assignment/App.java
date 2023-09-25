package com.infosys.anchal.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        LibraryService libraryService = (LibraryService) context.getBean("libraryService");
        libraryService.displayBooks();
    }
}

package com.infosys.anchal.annotationExample2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.anchal.beans.Books;
import com.infosys.anchal.config.Config;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        Books myBook = context.getBean("myBook", Books.class);
        System.out.println("Book 1: " + myBook.getBookName());
        
        Books childrenBook = context.getBean("childrenBook", Books.class);
        System.out.println("Book 2: " + childrenBook.getBookName());
        
        Books book = context.getBean(Books.class);
        System.out.println("primary book bean : "+book);
        
    }
    
}

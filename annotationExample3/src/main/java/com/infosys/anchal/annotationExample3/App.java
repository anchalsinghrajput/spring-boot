package com.infosys.anchal.annotationExample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.anchal.beans.User;
import com.infosys.anchal.config.Config;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	User u = context.getBean(User.class);
    	u.show();
    }
}
package com.infosys.anchal.assignment_02_2;
import com.infosys.anchal.beans.CustomerDetail;
import com.infosys.anchal.beans.ProductDetail;
import com.infosys.anchal.config.Config;
import com.infosys.anchal.services.Electronics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Electronics electronics = context.getBean(Electronics.class);
        
        CustomerDetail Alice = context.getBean("Alice", CustomerDetail.class);
        CustomerDetail Anchal = context.getBean("Anchal", CustomerDetail.class);
        CustomerDetail Ankit = context.getBean("Ankit", CustomerDetail.class);
        
        ProductDetail Laptop = context.getBean("Laptop", ProductDetail.class);
        ProductDetail Ipad = context.getBean("Ipad", ProductDetail.class);
        ProductDetail sdCard = context.getBean("sdCard", ProductDetail.class);

    
        electronics.placeOrder(Anchal, Ipad); // ipad quntity = 1
        electronics.placeOrder(Alice, Ipad); // ipad quantity = 0 (hence order is not placed)
   
        electronics.placeOrder(Anchal, Laptop); // laptop quantity = 2
        electronics.placeOrder(Alice, Laptop); // laptop quantity = 1
        
        electronics.placeOrder(Ankit, Laptop); // laptop quantity = 0 (order cannot be placed)
        electronics.placeOrder(Ankit, sdCard);
        
        electronics.displayOrders();
    }
}







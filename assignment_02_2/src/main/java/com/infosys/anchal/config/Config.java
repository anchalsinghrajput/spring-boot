package com.infosys.anchal.config;
import com.infosys.anchal.beans.CustomerDetail;
import com.infosys.anchal.beans.ProductDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.infosys.anchal.services")
public class Config {
	
    @Bean(name = "Alice")
    public CustomerDetail customer1() {
        CustomerDetail customer = new CustomerDetail();
        customer.setCustomerName("Alice");
        customer.setAge(30);
        return customer;
    }

    @Bean(name = "Anchal")
    public CustomerDetail customer2() {
        CustomerDetail customer = new CustomerDetail();
        customer.setCustomerName("Anchal");
        customer.setAge(21);
        return customer;
    }
    
    @Bean(name = "Ankit")
    public CustomerDetail customer3() {
        CustomerDetail customer = new CustomerDetail();
        customer.setCustomerName("Ankit");
        customer.setAge(21);
        return customer;
    }
    
    @Bean(name = "Laptop")
    public ProductDetail product1() {
        ProductDetail product = new ProductDetail();
        product.setProductName("Laptop");
        product.setQuantity(2);
        return product;
    }
    
    @Bean(name = "Ipad")
    public ProductDetail product2() {
        ProductDetail product = new ProductDetail();
        product.setProductName("Ipad");
        product.setQuantity(1);
        return product;
    }
    
    @Bean(name = "sdCard")
    public ProductDetail product3() {
        ProductDetail product = new ProductDetail();
        product.setProductName("sdCard");
        product.setQuantity(1);
        return product;
    }
}

package com.infosys.anchal.services;

import com.infosys.anchal.beans.CustomerDetail;
import com.infosys.anchal.beans.ProductDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Electronics {
    private Map<CustomerDetail, List<ProductDetail>> orders = new HashMap<>();
    
    public void placeOrder(CustomerDetail customer, ProductDetail product) {
        List<ProductDetail> customerOrders = orders.get(customer);
        if(product.getQuantity() == 0) {
        	System.out.println("Order cannot be placed by " + customer.getCustomerName() + " because the " +product.getProductName() + " qantity is 0 \n");
        	return;
        }
        if (customerOrders == null) {
            customerOrders = new ArrayList<>();
            orders.put(customer, customerOrders);
        }
        customerOrders.add(product);
        product.setQuantity(product.getQuantity() -1 );
    }

    public void displayOrders() {
        System.out.println("All placed order details : ");
        System.out.println("==========================================");
        System.out.println("| Customer   | Age | Products           |");
        System.out.println("==========================================");

        for (Map.Entry<CustomerDetail, List<ProductDetail>> entry : orders.entrySet()) {
            CustomerDetail customer = entry.getKey();
            List<ProductDetail> customerOrders = entry.getValue();
            StringBuilder productNames = new StringBuilder();
            for (ProductDetail product : customerOrders) {
                if (productNames.length() > 0) {
                    productNames.append(", ");
                }
                productNames.append(product.getProductName());
            }

            System.out.printf("| %-11s| %-4d| %-20s|\n", customer.getCustomerName(), customer.getAge(), productNames.toString());
        }

        System.out.println("==========================================");
    }


}

package com.infosys.anchal.assignments;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private PaymentService paymentService;
    private List<Item> items;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        this.items = new ArrayList<>();
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        System.out.println("Added item: " + item.getName() + " (ID: " + item.getId() + ") with the price " +item.getPrice() +" to the order.");
    }

    public void placeOrder() {
        double totalAmount = calculateTotalAmount();
        System.out.println("Placing order with a total amount of $" + totalAmount);
        paymentService.processPayment(totalAmount);
        System.out.println("Order placed successfully!");
    }

    private double calculateTotalAmount() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}

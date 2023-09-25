package com.infosys.anchal.assignments;

import lombok.Data;

@Data
public class Item {
    private int id;
    private String name;
    private double price;

    public Item(){}
    public Item(int id, String name, double price){
    	this.id = id;
    	this.name = name;
    	this.price = price;
    }
    
}


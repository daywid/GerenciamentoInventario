package com.gerenciamentoInventario.day.Products;

public abstract class Product {
    private String name;
    private double price;
    private String sku;

    public Product(String name, double price, String sku) {
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("SKU: " + sku);
    }
}
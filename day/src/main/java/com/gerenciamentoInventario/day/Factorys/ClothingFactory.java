package com.gerenciamentoInventario.day.Factorys;

import org.springframework.stereotype.Component;

import com.gerenciamentoInventario.day.Products.Camisa;
import com.gerenciamentoInventario.day.Products.Jeans;
import com.gerenciamentoInventario.day.Products.Product;

@Component
public class ClothingFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price, String sku) {
        
        if (name.equalsIgnoreCase("Camisa")) {
            return new Camisa(name, price, sku);
        } else if (name.equalsIgnoreCase("Jeans")) {
            return new Jeans(name, price, sku);
        }
        return null;
    }
}
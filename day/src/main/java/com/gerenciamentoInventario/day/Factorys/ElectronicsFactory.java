package com.gerenciamentoInventario.day.Factorys;

import org.springframework.stereotype.Component;

import com.gerenciamentoInventario.day.Products.Notebook;
import com.gerenciamentoInventario.day.Products.Product;
import com.gerenciamentoInventario.day.Products.Smartphone;

@Component
public class ElectronicsFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price, String sku) {
        
        if (name.equalsIgnoreCase("Smartphone")) {
            return new Smartphone(name, price, sku);
        } else if (name.equalsIgnoreCase("Notebook")) {
            return new Notebook(name, price, sku);
        }
        return null;
    }
}

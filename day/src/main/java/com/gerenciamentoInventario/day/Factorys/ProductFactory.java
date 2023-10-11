package com.gerenciamentoInventario.day.Factorys;

import org.springframework.stereotype.Component;

import com.gerenciamentoInventario.day.Products.Product;

@Component 
public interface ProductFactory {
    Product createProduct(String name, double price, String sku);
}

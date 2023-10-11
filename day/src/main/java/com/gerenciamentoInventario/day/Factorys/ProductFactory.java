package com.gerenciamentoInventario.day.Factorys;

import com.gerenciamentoInventario.day.Products.Product;

public interface ProductFactory {
    Product createProduct(String name, double price, String sku);
}

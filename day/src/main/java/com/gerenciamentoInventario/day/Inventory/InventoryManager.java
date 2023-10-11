package com.gerenciamentoInventario.day.Inventory;

import com.gerenciamentoInventario.day.Factorys.ProductFactory;
import com.gerenciamentoInventario.day.Products.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


@Component
public class InventoryManager {
    private final List<Product> inventory = new ArrayList<>();
    private final List<ProductFactory> productFactories;

    @Autowired
    public InventoryManager(List<ProductFactory> productFactories) {
        this.productFactories = productFactories;
    }

    public void addProduct(String name, double price, String sku) {
        Product product = null;
        for (ProductFactory factory : productFactories) {
            product = factory.createProduct(name, price, sku);
            if (product != null) {
                break;
            }
        }

        if (product != null) {
            inventory.add(product);
            System.out.println("Produto adicionado ao invetário: " + product.name);
        } else {
            System.out.println("Nome invalido de protudo: " + name);
        }
    }

    public void removeProduct(String sku) {
        Iterator<Product> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.sku.equals(sku)) {
                iterator.remove();
                System.out.println("Produto com SKU " + sku + " removido do inventário.");
                return; // Exit the loop after removal
            }
        }
        System.out.println("Produto com SKU " + sku + " não encontrado no inventário.");
    }

    public void listInventory() {
        System.out.println("Inventário:");
        for (Product product : inventory) {
            product.displayInfo();
            System.out.println();
        }
    }
}
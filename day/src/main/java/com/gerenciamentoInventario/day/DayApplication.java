package com.gerenciamentoInventario.day;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.gerenciamentoInventario.day.DependencyInjection.AppConfig;
import com.gerenciamentoInventario.day.Inventory.InventoryManager;

public class DayApplication {
  
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        InventoryManager inventoryManager = context.getBean(InventoryManager.class);

        // Adicione alguns produtos ao inventário
        inventoryManager.addProduct("Smartphone", 499.99, "SKU123");
        inventoryManager.addProduct("Notebook", 799.99, "SKU456");
        inventoryManager.addProduct("Camisa", 29.99, "SKU789");
        inventoryManager.addProduct("Jeans", 49.99, "SKU101");

        // Liste o inventário
        inventoryManager.listInventory();

        // Remova um produto do inventário
        inventoryManager.removeProduct("SKU456");

        // Liste o inventário novamente após a remoção
        inventoryManager.listInventory();

        context.close();
    }


}
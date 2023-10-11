// package com.gerenciamentoInventario.day;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class DayApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(DayApplication.class, args);
// 	}

// }

package com.gerenciamentoInventario.day;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.gerenciamentoInventario.day.DependencyInjection.AppConfig;
import com.gerenciamentoInventario.day.Factorys.ProductFactory;
import com.gerenciamentoInventario.day.Inventory.InventoryManager;

public class DayApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductFactory electronicsFactory = context.getBean("electronicsFactory", ProductFactory.class);
        ProductFactory clothingFactory = context.getBean("clothingFactory", ProductFactory.class);

        InventoryManager inventoryManager = new InventoryManager(electronicsFactory);

        inventoryManager.addProduct("Smartphone", 799.99, "SKU789");
        inventoryManager.addProduct("Notebook", 1499.99, "SKU456");
        inventoryManager.addProduct("Camisa", 29.99, "SKU111");
        inventoryManager.addProduct("Jeans", 59.99, "SKU222");

        System.out.println("Inventory Contents:");
        inventoryManager.listProducts();
    }
}

// package com.gerenciamentoInventario.day.Inventory;

package com.gerenciamentoInventario.day.Inventory;

import com.gerenciamentoInventario.day.Products.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InventoryManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}


























// import java.util.ArrayList;
// import java.util.List;

// import com.gerenciamentoInventario.day.Factorys.ProductFactory;
// import com.gerenciamentoInventario.day.Products.Product;

// public class InventoryManager {
//     private List<Product> products = new ArrayList<>();
//     private ProductFactory productFactory;

//     public InventoryManager(ProductFactory productFactory) {
//         this.productFactory = productFactory;
//     }

//     // public void addProduct(String name, double price, String sku) {
//     //     Product product = productFactory.createProduct(name, price, sku);
//     //     products.add(product);
//     // }

//     public void addProduct(String name, double price, String sku) {
//         Product product = productFactory.createProduct(name, price, sku);
//         if (product != null) {
//             products.add(product);
//         } else {
//             System.out.println("Product with name " + name + " not found in the factory.");
//         }
//     }
    

//     public void removeProduct(Product product) {
//         products.remove(product);
//     }

//     public void listProducts() {
//         for (Product product : products) {
//             product.displayInfo();
//         }
//     }
// }

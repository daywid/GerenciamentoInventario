package com.gerenciamentoInventario.day.DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gerenciamentoInventario.day.Factorys.ClothingFactory;
import com.gerenciamentoInventario.day.Factorys.ElectronicsFactory;
import com.gerenciamentoInventario.day.Factorys.ProductFactory;

@Configuration
public class AppConfig {
    // @Bean
    // public ProductFactory electronicsFactory() {
    //     return new ElectronicsFactory();
    // }

    // @Bean
    // public ProductFactory clothingFactory() {
    //     return new ClothingFactory();
    // }

    // @Bean
    // public ProductFactory productFactory() {
    //     return new ProductFactory();
    // }



}
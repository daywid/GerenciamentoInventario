package com.gerenciamentoInventario.day.DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.gerenciamentoInventario.day.Factorys.ClothingFactory;
import com.gerenciamentoInventario.day.Factorys.ElectronicsFactory;
import com.gerenciamentoInventario.day.Factorys.ProductFactory;

@Configuration
@ComponentScan("com.gerenciamentoInventario.day")
public class AppConfig {
        @Bean
        public ProductFactory electronicsFactory() {
         return new ElectronicsFactory();
        }

        @Bean
        public ProductFactory clothingFactory() {
         return new ClothingFactory();
        }

}
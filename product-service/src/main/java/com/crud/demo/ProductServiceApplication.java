package com.crud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.persistence.autoconfigure.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
    //@ComponentScan(basePackages = "com.crud.demo")
    //@EnableJpaRepositories(basePackages = "com.crud.demo.repository")
    //@EntityScan(basePackages = "com.crud.demo")
    // Above three annotations are required if Application class is in package: com.crud.demo.product_service
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}

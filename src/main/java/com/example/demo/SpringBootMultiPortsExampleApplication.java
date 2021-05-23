package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(com.example.demo.config.ApplicationConfiguration.class)
public class SpringBootMultiPortsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMultiPortsExampleApplication.class, args);
    }

}

package com.digitalpontos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigitalPontosApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalPontosApplication.class, args);
        System.out.println("Sistema em pé");
    }

}
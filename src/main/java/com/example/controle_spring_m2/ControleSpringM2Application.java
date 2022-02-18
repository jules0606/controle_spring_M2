package com.example.controle_spring_m2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ControleSpringM2Application {

    public static void main(String[] args) {
        SpringApplication.run(ControleSpringM2Application.class, args);
    }

}

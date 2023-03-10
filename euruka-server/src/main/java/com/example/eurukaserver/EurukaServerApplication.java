package com.example.eurukaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer    // Enable eureka server
public class EurukaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurukaServerApplication.class, args);
    }

}

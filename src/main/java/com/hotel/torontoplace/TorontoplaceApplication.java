package com.hotel.torontoplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class TorontoplaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TorontoplaceApplication.class, args);
    }
}

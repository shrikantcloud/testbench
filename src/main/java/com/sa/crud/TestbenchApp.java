package com.sa.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestbenchApp {

    private static final String SPRING_ACTIVE_PROFILE_KEY = "spring.profiles.active";
    private static final String SPRING_ACTIVE_PROFILE_DEV = "dev";

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.setProperty(SPRING_ACTIVE_PROFILE_KEY, SPRING_ACTIVE_PROFILE_DEV);
        SpringApplication.run(TestbenchApp.class);
    }
}

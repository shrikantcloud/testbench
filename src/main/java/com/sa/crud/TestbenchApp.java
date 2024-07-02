package com.sa.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

//https://www.javaguides.net/2022/12/deploy-spring-boot-mysql-application-to-docker.html
@SpringBootApplication
public class TestbenchApp {

//    private static final String SPRING_ACTIVE_PROFILE_KEY = "spring.profiles.active";
//    private static final String SPRING_ACTIVE_PROFILE_DEV = "dev";
    private static final String WINDOWS_VERSION_CHECK_CMD = "systeminfo | findstr /B /C:\"OS Name\" /B /C:\"OS Version\"";

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        //System.setProperty(SPRING_ACTIVE_PROFILE_KEY, SPRING_ACTIVE_PROFILE_DEV);
        SpringApplication.run(TestbenchApp.class);
    }
}

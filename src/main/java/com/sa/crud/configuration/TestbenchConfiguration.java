package com.sa.crud.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.sa.crud.*")
@ComponentScan(basePackages = "com.sa.crud.*")
@EntityScan("com.sa.crud.*")
public class TestbenchConfiguration {
}

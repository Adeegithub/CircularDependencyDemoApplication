package org.adeesha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CircularDependencyDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CircularDependencyDemoApplication.class, args);
    }
}
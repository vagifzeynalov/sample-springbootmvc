package com.zeynalov.sample.springbootmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:application.properties"})
@ComponentScan(basePackages = {"com.zeynalov.sample"})
public class ApiApplication extends SpringApplication {

    public static void main(String[] args) {
        new SpringApplication(ApiApplication.class).run(args);
    }

}

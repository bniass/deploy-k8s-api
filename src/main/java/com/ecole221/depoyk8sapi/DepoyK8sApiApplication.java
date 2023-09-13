package com.ecole221.depoyk8sapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DepoyK8sApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DepoyK8sApiApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DepoyK8sApiApplication.class);
    }

}

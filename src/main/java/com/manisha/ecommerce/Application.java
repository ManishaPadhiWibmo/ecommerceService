package com.manisha.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller", "service"})*/
@SpringBootApplication
public class Application {

    public static void main(String args[]){

        SpringApplication.run(Application.class, args);

    }
}

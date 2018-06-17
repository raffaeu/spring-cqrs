package com.ubs.backEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Bootstrap class for the back-end
 */
@SpringBootApplication(scanBasePackages = {
        "com.ubs.backEnd",
        "com.ubs.backEnd.navigation"
})
public class Application {

    public static void main(String[] args) {

         SpringApplication.run(Application.class, args);

    }
}

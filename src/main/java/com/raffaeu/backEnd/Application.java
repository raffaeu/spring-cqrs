package com.raffaeu.backEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Bootstrap class for the back-end
 */
@SpringBootApplication(scanBasePackages = {
        "com.raffaeu.backEnd",
        "com.raffaeu.backEnd.navigation"
})
public class Application {

    public static void main(String[] args) {

         SpringApplication.run(Application.class, args);

    }
}

package com.gitTest.gitTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.gitTest.gitTest")
public class App 
{
   public static void main(String[] args) throws Exception {
	SpringApplication.run(App.class, args);
}

}

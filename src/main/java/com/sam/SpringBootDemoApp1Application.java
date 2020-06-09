package com.sam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SpringBootDemoApp1Application.class, args);
		run.close();
	}

}

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DemoApplication {

	@Bean
	Greeter getGreeter() {
		return new B();
	}

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(DemoApplication.class);
		A a = context.getBean(A.class);
		a.hello();
	}
}

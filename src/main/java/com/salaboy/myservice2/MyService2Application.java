package com.salaboy.myservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyService2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyService2Application.class, args);
	}

	@GetMapping
	public String hello(){
		return "hello from k8s";
	}
}

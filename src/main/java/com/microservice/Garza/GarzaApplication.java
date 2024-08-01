package com.microservice.Garza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class GarzaApplication {

	@GetMapping("/weatherForecast")
	public String getMessage(){
		return "Today is a great sunny day for a Java service";
	}

	public static void main(String[] args) {
		SpringApplication.run(GarzaApplication.class, args);
	}

}

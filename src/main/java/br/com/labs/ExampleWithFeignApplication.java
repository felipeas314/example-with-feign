package br.com.labs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExampleWithFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleWithFeignApplication.class, args);
	}

}

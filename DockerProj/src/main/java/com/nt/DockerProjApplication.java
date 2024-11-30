package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerProjApplication.class, args);
		System.out.println("Welcome to Spring Boot Docker Proj01");
	}

}

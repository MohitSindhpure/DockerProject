package com.dockerimage.DockerProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerProjectApplication.class, args);

		System.out.println("Docker Main Class Running.");
	}

}

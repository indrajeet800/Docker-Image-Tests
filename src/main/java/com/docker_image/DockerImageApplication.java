package com.docker_image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// In this we perform docker code to docker file thne image thne docker hub then contcainer 
@SpringBootApplication
public class DockerImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerImageApplication.class, args);
	}

}

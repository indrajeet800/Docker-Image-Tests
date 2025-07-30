package com.docker_image.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/docker")
public class DockerImage {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Docker-images";
	}
  
}

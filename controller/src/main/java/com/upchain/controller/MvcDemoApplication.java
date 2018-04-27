package com.upchain.controller;

import com.upchain.repository.RepositoryBasePackageMarker;
import com.upchain.service.ServiceBasePackageMarker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = { ControllerBasePackageMarker.class, ServiceBasePackageMarker.class, RepositoryBasePackageMarker.class})
public class MvcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcDemoApplication.class, args);
	}
}

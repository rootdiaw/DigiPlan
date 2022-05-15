package com.smart.app2;

import com.smart.app2.services.PlateformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App2Application implements CommandLineRunner {

	@Autowired
	private PlateformeService plateformeService;

	public static void main(String[] args) {
		SpringApplication.run(App2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}
}

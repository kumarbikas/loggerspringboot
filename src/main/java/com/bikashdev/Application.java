package com.bikashdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bikashdev.service.MyService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private MyService myService;

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Override
	public void run(final String args[]) {
		myService.doStuff("value");
	}
}

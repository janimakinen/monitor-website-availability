package com.janimakinen.monitorwebsiteavailability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonitorWebsiteAvailabilityApplication {

	String helloMessage = "Hello World";

	public static void main(String[] args) {
		SpringApplication.run(MonitorWebsiteAvailabilityApplication.class, args);
	}

	public String getHelloMessage() {
		return helloMessage;
	}

}

package com.janimakinen.monitorwebsiteavailability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = { MonitorService.class })
public class MonitorWebsiteAvailabilityApplication {
	public static void main(String[] args) {
		SpringApplication.run(MonitorWebsiteAvailabilityApplication.class, args);
	}

}

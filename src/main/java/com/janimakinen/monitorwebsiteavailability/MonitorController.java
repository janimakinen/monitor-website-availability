package com.janimakinen.monitorwebsiteavailability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {

    @Autowired
    MonitorWebsiteAvailabilityApplication application;

    @GetMapping("/")
    public String home() {
        return application.getHelloMessage();
    }

}

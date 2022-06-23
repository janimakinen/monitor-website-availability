package com.janimakinen.monitorwebsiteavailability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {

    @Autowired
    MonitorWebsiteAvailabilityApplication application;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return application.getHelloMessage();
    }

}

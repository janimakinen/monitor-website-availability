package com.janimakinen.monitorwebsiteavailability;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class MonitorWebsiteAvailabilityApplicationTest {

    @Autowired
    MonitorWebsiteAvailabilityApplication application;

    @Autowired
    MonitorController monitorController;

    @Test
    void mainLoads() {
        assertThat(application).isNotNull();
        assertThat(monitorController).isNotNull();
    }
}
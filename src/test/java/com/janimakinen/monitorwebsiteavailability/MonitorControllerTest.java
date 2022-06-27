package com.janimakinen.monitorwebsiteavailability;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MonitorControllerTest {

    @Autowired
    MonitorService monitorService;

    @Test
    void monitor() {
        assertThat(monitorService.monitorURLs()).doesNotContain("error");
        System.out.println("Result of test run of monitor service get URLs:" + monitorService.monitorURLs());
    }
}
package com.janimakinen.monitorwebsiteavailability;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MonitorControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    MonitorController monitorController;

    @Autowired
    MonitorWebsiteAvailabilityApplication application;

    @Test
    void controllerLoads() {
        assertThat(application).isNotNull();
        assertThat(monitorController).isNotNull();
    }

    @Test
    void homeEndpoint() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                        .get("/"))
                        .andExpect(status().isOk())
                        .andReturn();

        assertThat(result.getResponse().getContentAsString()).isEqualTo(application.getHelloMessage());
    }

    @Test
    void home() {
        assertThat(monitorController.home()).isEqualTo(application.getHelloMessage());
    }
}
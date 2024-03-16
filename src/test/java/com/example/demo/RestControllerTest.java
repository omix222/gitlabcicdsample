package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Test class for RestController
 : CithubCopilotで作成したテストケース
 */
@SpringBootTest
@AutoConfigureMockMvc
public class RestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloEndpointReturnsHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!"));
    }

    //@Test
    public void helloEndpointReturnsNotFoundForPost() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/hello"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    public void helloEndpointReturnsNotFoundForInvalidPath() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/invalidURLisNotFound"))
                .andExpect(status().isNotFound());
    }
}
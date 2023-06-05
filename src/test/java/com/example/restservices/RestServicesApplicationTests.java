package com.example.restservices;

import com.example.restservices.hello.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RestServicesApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testNorHrllo() {
        HelloController helloController = new HelloController();

        assertEquals(helloController.HelloWord(), "Hello World!");
    }

}

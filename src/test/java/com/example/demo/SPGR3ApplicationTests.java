package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SPGR3ApplicationTests {

    @Autowired
    private ApplicationContext context;

    /**
     * Test to ensure the Spring application context loads without issues.
     */
    @Test
    void shouldLoadApplicationContext() {
        // Application context loading is verified by the @SpringBootTest annotation
        assertNotNull(context, "The application context should have been loaded and should not be null");
    }
}
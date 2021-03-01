package com.marino.alfredo.events.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventConfigTest {

    private EventConfig eventConfig;

    @BeforeEach
    void setUp() {
        eventConfig = new EventConfig();
    }

    @Test
    void setAndGetATopic() {
        eventConfig.setTopic("test-topic");

        assertEquals("test-topic", eventConfig.getTopic());
    }
}
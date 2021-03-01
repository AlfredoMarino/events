package com.marino.alfredo.events.service.impl;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import com.marino.alfredo.events.config.EventConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PubSubEventServiceImplTest {

    @Mock
    private PubSubTemplate mockPubSubTemplate;
    @Mock
    private EventConfig mockEventConfig;

    @InjectMocks
    private PubSubEventServiceImpl pubSubEventService;

    @Test
    void shouldPublish() {
        when(mockEventConfig.getTopic()).thenReturn("test-topic");

        pubSubEventService.publish("test");

        verify(mockPubSubTemplate).publish("test-topic", "test");
    }
}
package com.marino.alfredo.events.service.impl;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import com.marino.alfredo.events.config.EventConfig;
import com.marino.alfredo.events.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PubSubEventServiceImpl implements EventService {

    private final PubSubTemplate pubSubTemplate;
    private final EventConfig eventConfig;

    @Autowired
    public PubSubEventServiceImpl(PubSubTemplate pubSubTemplate, EventConfig eventConfig) {
        this.pubSubTemplate = pubSubTemplate;
        this.eventConfig = eventConfig;
    }

    @Override
    public void publish(String message) {
        pubSubTemplate.publish(eventConfig.getTopic(), message);
    }
}

package com.marino.alfredo.events;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(properties = {"aamv.events.topic=test-topic"})
class EventsApplicationTests {

	@Test
	void contextLoads() {
	}

}

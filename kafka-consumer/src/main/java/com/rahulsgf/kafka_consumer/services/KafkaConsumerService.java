package com.rahulsgf.kafka_consumer.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "test-topic", groupId = "test-consumer-group")
    public void consume(String message) {
        log.info("Consumed message: {}", message);
    }
}

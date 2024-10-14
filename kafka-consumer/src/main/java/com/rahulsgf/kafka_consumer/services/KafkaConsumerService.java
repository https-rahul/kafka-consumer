package com.rahulsgf.kafka_consumer.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "test-topic", groupId = "test-consumer-group")
    public void consume(String message) {

        long currentMillis = System.currentTimeMillis();
        Date receiveTime = new Date(currentMillis);

        log.info("Consumed message: {} at: {}", message, receiveTime);
    }
}

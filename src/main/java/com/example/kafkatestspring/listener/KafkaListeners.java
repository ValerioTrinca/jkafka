package com.example.kafkatestspring.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "mytopic", groupId = "groupId")
    public void listener(String data) {
        System.out.println("[KAFKA LOG] ------> received: " + data);
    }
}

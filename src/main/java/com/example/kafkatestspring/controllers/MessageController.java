package com.example.kafkatestspring.controllers;

import com.example.kafkatestspring.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String publish(@RequestBody MessageRequest messageRequest) {
        kafkaTemplate.send("mytopic", messageRequest.message());
        return "Send messages " + messageRequest.message();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}

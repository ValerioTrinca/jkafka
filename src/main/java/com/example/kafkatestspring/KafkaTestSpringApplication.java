package com.example.kafkatestspring;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.HashMap;
import java.util.Map;*/

@SpringBootApplication
public class KafkaTestSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaTestSpringApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            for(int i = 0; i < 20; i++){
                kafkaTemplate.send("topictest", "Hello Kafka! " + i);
            }
        };
    }*/
}

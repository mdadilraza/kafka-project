package com.eidiko.kafka_example.controller;

import com.eidiko.kafka_example.kafka.JsonKafkaProducer;
import com.eidiko.kafka_example.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    private final JsonKafkaProducer kafkaProducer ;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User data){
        kafkaProducer.sendMessage(data);
        return ResponseEntity.ok("Json Message sent to Kafka broker");
    }
}

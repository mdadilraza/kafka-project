package com.eidiko.kafka_example.kafka;
import com.eidiko.kafka_example.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaJsonConsumer {

    @KafkaListener(topics = "javaguides_json" , groupId = "myGroup")
    public void consume(User user){
        log.info("Json Message Received {} " , user);
    }
}

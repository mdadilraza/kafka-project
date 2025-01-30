package com.eidiko.kafka_example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaGuidesTopic(){
        return TopicBuilder.name("javaguides")
               // .partitions(10) //to make number of partition
                .build();

    }
}

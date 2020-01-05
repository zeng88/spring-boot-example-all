package com.example.topic;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TopicProducer {

    @Resource(name = "v1RabbitTemplate")
    private RabbitTemplate v1RabbitTemplate;

    public void sendMessageByTopic() {
        String content = "This is a topic type of the RabbitMQ message example";
        this.v1RabbitTemplate.convertAndSend(
                "exchange.topic.example.new",
                "routing.key.example.new",
                content);
    }

}

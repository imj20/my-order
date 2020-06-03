package com.example.demo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.cloud.stream.messaging.Processor;

@Service
public class KafkaListener {

    @StreamListener(Processor.INPUT)
    public void onEventByString(@Payload String event){
        System.out.println("====== start event message ================");
        System.out.println(event);
        System.out.println("====== end event message ================");
    }

}
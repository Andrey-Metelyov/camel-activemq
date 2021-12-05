package com.example.camelactivemq.camel;

import com.example.camelactivemq.Message;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Sender extends RouteBuilder {
    @Autowired
    GetMessage getMessage;

    @Override
    public void configure() throws Exception {
        from("timer:sender-timer")
                .bean(getMessage)
//                .transform().constant("Test message")
                .to("activemq:my-queue")
                .log("${body}");
    }
}

@Component
class GetMessage {
    public Message getMessage() {
        return new Message(LocalTime.now().toString());
    }
}

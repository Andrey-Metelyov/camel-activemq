package com.example.camelactivemq;

import com.example.camelactivemq.camel.Sender;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelActivemqApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CamelActivemqApplication.class, args);
    }
}

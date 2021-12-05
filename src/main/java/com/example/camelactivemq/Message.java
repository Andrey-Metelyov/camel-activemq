package com.example.camelactivemq;

import java.io.Serializable;

public class Message implements Serializable {
    private final String value;

    public Message(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Message{" +
                "value='" + value + '\'' +
                '}';
    }
}



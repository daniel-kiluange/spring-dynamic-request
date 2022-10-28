package com.example.springmutablerequest.runner;

import com.example.springmutablerequest.engine.OrderMessage;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderRunner {
  @EventListener
  public void handleSuccessful(OrderMessage message) {
    System.out.println(message.getMessageBody());
  }

}

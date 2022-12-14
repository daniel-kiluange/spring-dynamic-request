package com.example.springmutablerequest.runner;

import com.example.springmutablerequest.engine.OrderMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderRunner {
  @EventListener
  public void handleSuccessful(OrderMessage message) {
    log.info("{}",message.getMessageBody());
  }

}

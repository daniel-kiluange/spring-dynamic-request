package com.example.springmutablerequest.runner;

import com.example.springmutablerequest.engine.UpdateMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UpdateRunner {

  @EventListener
  public void handleSuccessful(UpdateMessage message) {
    log.info("{}",message.getMessageBody());
  }

}

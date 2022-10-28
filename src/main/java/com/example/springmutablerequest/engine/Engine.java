package com.example.springmutablerequest.engine;

import org.springframework.context.ApplicationEventPublisher;

public class Engine<T extends Message<?>> {


  private T message;
  private ApplicationEventPublisher applicationEventPublisher;
  public Engine(T message, ApplicationEventPublisher applicationEventPublisher) {
    this.message = message;
    this.applicationEventPublisher = applicationEventPublisher;
  }

  public void run() {
    applicationEventPublisher.publishEvent(message);
  }

}

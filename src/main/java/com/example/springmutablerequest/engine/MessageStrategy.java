package com.example.springmutablerequest.engine;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageStrategy {

  private final ApplicationEventPublisher applicationEventPublisher;


  public void execute(String context, Map<String, ?> content) {
    var engine = switch (context) {

      case "order" -> {
        var message = new OrderMessage(content);
        yield new Engine<>(message, applicationEventPublisher);
      }
      case "update" -> {
        var message = new UpdateMessage(content);
        yield new Engine<>(message, applicationEventPublisher);
      }
      default -> throw new RuntimeException("Nothing to do");
    };

    engine.run();
  }

}

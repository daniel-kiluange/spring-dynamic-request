package com.example.springmutablerequest.controller;

import com.example.springmutablerequest.controller.request.TestRequest;
import com.example.springmutablerequest.engine.Message;
import com.example.springmutablerequest.engine.MessageStrategy;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
@RequiredArgsConstructor
public class TestController {


  private final MessageStrategy messageStrategy;

  @PostMapping
  void testEndpointList(@RequestBody Collection<TestRequest> request){
    log.info("{}",request);

    for (TestRequest message : request) {
      messageStrategy.execute(message.context(), message.content());
    }
  }

}

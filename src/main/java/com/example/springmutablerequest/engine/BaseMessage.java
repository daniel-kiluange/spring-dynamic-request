package com.example.springmutablerequest.engine;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

public abstract class BaseMessage<B> implements Message<B> {

  ObjectMapper mapper = new ObjectMapper();
  Map<String, ?> content;
   BaseMessage(Map<String, ?> content) {
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    this.content = content;
  }
}

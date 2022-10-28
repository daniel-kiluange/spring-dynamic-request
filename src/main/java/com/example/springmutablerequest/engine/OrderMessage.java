package com.example.springmutablerequest.engine;

import java.util.Map;

public class OrderMessage extends BaseMessage<OrderMessageBody> {


  public OrderMessage(Map<String, ?> content) {
    super(content);
  }

  @Override
  public OrderMessageBody getMessageBody() {
    return this.mapper.convertValue(this.content, OrderMessageBody.class);
  }

  @Override
  public void showMessage() {
    System.out.println("Order");
  }
}

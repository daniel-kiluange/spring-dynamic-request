package com.example.springmutablerequest.engine;

import java.util.Map;

public class UpdateMessage extends BaseMessage<UpdateMessageBody> {


  public UpdateMessage(Map<String, ?> content) {
    super(content);
  }

  @Override
  public UpdateMessageBody getMessageBody() {
    return this.mapper.convertValue(this.content, UpdateMessageBody.class);
  }

  @Override
  public void showMessage() {
    System.out.println("Update");
  }
}

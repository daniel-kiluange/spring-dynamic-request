package com.example.springmutablerequest.engine;

public interface Message<B> {

  void showMessage();
  B getMessageBody();

}

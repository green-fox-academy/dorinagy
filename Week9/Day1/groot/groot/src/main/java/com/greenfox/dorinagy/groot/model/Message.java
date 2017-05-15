package com.greenfox.dorinagy.groot.model;

import com.greenfox.dorinagy.groot.service.ResponseMessage;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
public class Message implements ResponseMessage {

  private String received;
  private String translated;

  public Message(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }
}

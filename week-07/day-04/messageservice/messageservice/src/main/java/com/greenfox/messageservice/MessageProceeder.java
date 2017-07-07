package com.greenfox.messageservice;

import com.greenfox.messageservice.service.MessageService;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
public class MessageProceeder {

  MessageService service;

  public MessageProceeder(MessageService service) {
    this.service = service;
  }

  public void processMessage(String message, String adress) {
    service.sendMessage(message, adress);
  }
}

package com.greenfox.messageservice.service;

import com.greenfox.messageservice.service.MessageService;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
public class TwitterService implements MessageService {

  @Override
  public void sendMessage(String message, String adress) {
    System.out.println("Tweet sent to " + adress + "with Message=" + message);
  }
}

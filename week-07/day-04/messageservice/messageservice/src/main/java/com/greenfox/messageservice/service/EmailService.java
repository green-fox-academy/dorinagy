package com.greenfox.messageservice.service;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
public class EmailService implements MessageService {

  @Override
  public void sendMessage(String message, String adress) {
    System.out.println("Email sent to " + adress + " with Message=" + message);
  }
}

package com.greenfox.dorinagy.groot.model;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
public class ErrorMessage implements ResponseMessage {

  private String error;

  public ErrorMessage() {
    this.error = "I am Groot!";
  }

  public String getError() {
    return error;
  }
}

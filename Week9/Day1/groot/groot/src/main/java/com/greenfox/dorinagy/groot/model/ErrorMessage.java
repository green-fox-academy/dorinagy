package com.greenfox.dorinagy.groot.model;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
public class ErrorMessage implements ResponseMessage {

  private String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }
}

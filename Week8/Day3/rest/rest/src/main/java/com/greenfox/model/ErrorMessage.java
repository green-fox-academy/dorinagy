package com.greenfox.model;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class ErrorMessage implements ResponseObject {

  private String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }
}

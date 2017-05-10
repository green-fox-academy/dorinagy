package com.greenfox.model;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class ErrorMessage implements ResponseObject {

  String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public ErrorMessage() {
    this.error = error;
  }
}

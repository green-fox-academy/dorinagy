package com.greenfox.model;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class ErrorObj implements ResponseObject {

  private String error;

  public ErrorObj(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }
}

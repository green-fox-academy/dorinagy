package com.greenfox.dorinagy.groot.model;

import com.greenfox.dorinagy.groot.service.ResponseMessage;

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

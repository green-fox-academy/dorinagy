package com.greenfox;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class Doubling implements ResponseObject {

  private int received;
  private int result;

  public Doubling(int received, int result) {
    this.received = received;
    this.result = result;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}

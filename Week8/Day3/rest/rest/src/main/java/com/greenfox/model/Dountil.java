package com.greenfox.model;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class Dountil implements ResponseObject {

  private int until;
  private int result;

  public void sum() {
    int sum = 0;
    for (int i = 0; i <= until; i++) {
      sum += i;
    }
    result = sum;
  }

  public void factor() {
    int factor = 1;
    for (int i = 1; i <= until; i++) {
      factor *= i;
    }
    result = factor;
  }

  public boolean notNegative() {
    return until >= 0;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }
}

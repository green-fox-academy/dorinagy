package com.greenfox.model;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class ArrayCalculatorIntArray implements ResponseObject {

  private int[] result;

  public ArrayCalculatorIntArray(int[] result) {
    this.result = result;
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }
}

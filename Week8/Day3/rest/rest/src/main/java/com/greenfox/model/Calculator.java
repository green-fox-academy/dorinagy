package com.greenfox;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class Calculator {

  private int result;

  public Calculator(String what, int until) {
    if (what.equals("sum")) {
      result = 0;
      for (int i = 1; i <= until; i++) {
        result += i;
      }
    }
    if (what.equals("factor")) {
      result = 1;
      for (int i = 1; i <= until; i++) {
        result *= i;
      }
    }
  }
}

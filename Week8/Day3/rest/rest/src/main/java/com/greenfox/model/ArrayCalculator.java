package com.greenfox.model;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class ArrayCalculator implements ResponseObject {

  private String what;
  private int[] numbers;

  public ResponseObject createResult() {
    if(what.equals("sum")) {
      int sum = 0;
      for(int number : numbers) {
        sum += number;
      }
      return new ArrayCalculatorInt(sum);
    } else if(what.equals("multiply")) {
      int multiplicationResult = 1;
      for(int number : numbers) {
        multiplicationResult *= number;
      }
      return new ArrayCalculatorInt(multiplicationResult);
    } else if(what.equals("double")) {
      int doubleResult[] = new int[numbers.length];
      for(int i = 0; i < numbers.length; i++) {
        doubleResult[i] = numbers[i] * 2;
      }
      return new ArrayCalculatorIntArray(doubleResult);
    }
    return new ErrorMessage("Please provide what to do with the numbers!");
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}

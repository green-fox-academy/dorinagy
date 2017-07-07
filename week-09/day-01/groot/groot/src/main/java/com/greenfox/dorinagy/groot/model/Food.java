package com.greenfox.dorinagy.groot.model;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
public class Food {

  private String name;
  private int amount;
  private int calories;

  public Food(String name) {
    this.name = name;
    amount = 0;
    calories = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }
}

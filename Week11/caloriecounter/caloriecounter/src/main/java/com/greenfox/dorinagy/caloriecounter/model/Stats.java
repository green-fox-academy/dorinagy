package com.greenfox.dorinagy.caloriecounter.model;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Nagy Dóra on 2017.06.05..
 */
@Component
public class Stats {

  private int numberOfMeals;
  private int calories;

  public int getNumberOfMeals() {
    return numberOfMeals;
  }

  public void setNumberOfMeals(int numberOfMeals) {
    this.numberOfMeals = numberOfMeals;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public Stats() {
  }

  public Stats(List<Meal> meals) {
    this.numberOfMeals = meals.size();
    this.calories = countCalories(meals);
  }

  public int countCalories(List<Meal> meals) {
    int calories = 0;
    for (Meal meal : meals) {
      calories += meal.getCalories();
    }
    return calories;
  }
}

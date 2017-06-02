package com.greenfox.dorinagy.caloriecounter.service;

import com.greenfox.dorinagy.caloriecounter.model.Meal;
import com.greenfox.dorinagy.caloriecounter.repository.MealRepository;
import com.greenfox.dorinagy.caloriecounter.repository.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nagy Dóra on 2017.06.02..
 */
@Service
public class MealService {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  public long sumMeals() {
    return mealRepository.count();
  }

  public int sumCalories() {
    int sumCalories = 0;
    Iterable<Meal> meals = mealRepository.findAll();
    for(Meal meal : meals) {
      sumCalories += meal.getCalories();
    }
    return sumCalories;
  }
}

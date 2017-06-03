package com.greenfox.dorinagy.caloriecounter.controller;

import com.greenfox.dorinagy.caloriecounter.model.Meal;
import com.greenfox.dorinagy.caloriecounter.repository.MealRepository;
import com.greenfox.dorinagy.caloriecounter.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
@RestController
public class AppRestController {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealService mealService;

  @GetMapping(value = "/getmeals")
  public Iterable<Meal> meals() {
    return mealRepository.findAll();
  }
}

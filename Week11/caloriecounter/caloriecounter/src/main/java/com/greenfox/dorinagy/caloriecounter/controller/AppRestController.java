package com.greenfox.dorinagy.caloriecounter.controller;

import com.greenfox.dorinagy.caloriecounter.model.Meal;
import com.greenfox.dorinagy.caloriecounter.model.Stats;
import com.greenfox.dorinagy.caloriecounter.repository.MealRepository;
import com.greenfox.dorinagy.caloriecounter.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

  @GetMapping("/getstats")
  public Stats getStats() {
    return new Stats(mealRepository.findAll());
  }

  @PostMapping("/meal")
  public ResponseEntity addNewMealJson(@Valid @RequestBody Meal meal, BindingResult bindingResult) {
    return mealService.saveMealJson(meal, bindingResult);
  }

  @PutMapping("/meal")
  public ResponseEntity editMealJson(@Valid @RequestBody Meal meal, BindingResult bindingResult) {
    return mealService.saveMealJson(meal, bindingResult);
  }

  @DeleteMapping("/meal")
  public ResponseEntity deleteMealJson(@RequestBody Meal meal) {
    return mealService.deleteMealJson(meal.getId());
  }
}

package com.greenfox.dorinagy.caloriecounter.service;

import com.greenfox.dorinagy.caloriecounter.model.Meal;
import com.greenfox.dorinagy.caloriecounter.model.Stats;
import com.greenfox.dorinagy.caloriecounter.model.Status;
import com.greenfox.dorinagy.caloriecounter.repository.MealRepository;
import com.greenfox.dorinagy.caloriecounter.repository.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashMap;

/**
 * Created by Nagy Dóra on 2017.06.02..
 */
@Service
public class MealService {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  @Autowired
  ModelAndView modelAndView;

  @Autowired
  Stats stats;

  public ModelAndView setIndexPage() {
    modelAndView.addObject("meals", mealRepository.findAll());
    modelAndView.addObject("calories", stats.countCalories(mealRepository.findAll()));
    modelAndView.setViewName("index");
    return modelAndView;
  }

  public ModelAndView saveMeal(@Valid Meal meal, BindingResult bindingResult) {
    if (!bindingResult.hasErrors()) {
      mealRepository.save(meal);
      return setIndexPage();
    }
    return setUpAddOrEditMealPage(meal);
  }

  public ModelAndView addNewMeal() {
    return setUpAddOrEditMealPage(new Meal());
  }

  public void deleteMeal(long id) {
    mealRepository.delete(id);
  }

  public ModelAndView editMeal(long id) {
    return setUpAddOrEditMealPage(mealRepository.findById(id));
  }

  public ModelAndView setUpAddOrEditMealPage(Meal meal) {
    modelAndView.addObject("meal", meal);
    modelAndView.addObject("mealtypes", mealTypeRepository.findAll());
    modelAndView.setViewName("addOrEditMeal");
    return modelAndView;
  }

  public ResponseEntity saveMealJson(@Valid Meal meal, BindingResult bindingResult) {
    if (!bindingResult.hasErrors()) {
      mealRepository.save(meal);
      return new ResponseEntity(new Status("ok"), HttpStatus.OK);
    }
    return new ResponseEntity(new Status("error"), HttpStatus.BAD_REQUEST);
  }

  public ResponseEntity deleteMealJson(long id) {
    if (mealRepository.findById(id) == null) {
      return new ResponseEntity(new Status("error"), HttpStatus.BAD_REQUEST);
    }
    deleteMeal(id);
    return new ResponseEntity(new Status("ok"), HttpStatus.OK);
  }

  public int sumCalories() {
    int sumCalories = 0;
    for (Meal meal : mealRepository.findAll()) {
      sumCalories += meal.getCalories();
    }
    return sumCalories;
  }

  public int numberOfMeals() {
    int numberOfMeals = (int) mealRepository.findAll().spliterator().getExactSizeIfKnown();
    return numberOfMeals;
  }
}

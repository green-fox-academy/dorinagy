package com.greenfox.dorinagy.caloriecounter.controller;

import com.greenfox.dorinagy.caloriecounter.model.Meal;
import com.greenfox.dorinagy.caloriecounter.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
@Controller
public class MainController {

  @Autowired
  MealService mealService;

  @GetMapping(value = "/")
  public ModelAndView homePage() {
    return mealService.setIndexPage();
  }

  @PostMapping(value = "/add")
  public ModelAndView setCalorieTable(@Valid Meal meal, BindingResult bindingResult) {
    return mealService.saveMeal(meal, bindingResult);
  }

  @GetMapping(value = "/add")
  public ModelAndView addNewMeal() {
    return mealService.addNewMeal();
  }

  @GetMapping("/delete/{id}")
  public String deleteMeal(@PathVariable long id) {
    mealService.deleteMeal(id);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public ModelAndView editMeal(@PathVariable long id) {
    return mealService.editMeal(id);
  }
}

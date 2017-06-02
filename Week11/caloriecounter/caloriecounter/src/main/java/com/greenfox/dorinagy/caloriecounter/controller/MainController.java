package com.greenfox.dorinagy.caloriecounter.controller;

import com.greenfox.dorinagy.caloriecounter.model.Meal;
import com.greenfox.dorinagy.caloriecounter.repository.MealRepository;
import com.greenfox.dorinagy.caloriecounter.repository.MealTypeRepository;
import com.greenfox.dorinagy.caloriecounter.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
@Controller
public class MainController {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  @Autowired
  MealService mealService;

  @GetMapping(value = "/")
  public String homePage(Model model) {
    model.addAttribute("meals", mealRepository.findAll());
    model.addAttribute("sumOfCalories", mealService.sumCalories());
    return "index";
  }

  @PostMapping(value = "/add")
  public String setCalorieTable(Model model, Meal meal) {
    mealService.addNewMeal(meal);
    model.addAttribute("meals", mealRepository.findAll());
    return "index";
  }

  @GetMapping(value = "/add")
  public String addMeal(Model model) {
    model.addAttribute("meal", new Meal());
    model.addAttribute("mealtypes", mealTypeRepository.findAll());
    return "addOrEditMeal";
  }

  @GetMapping("/delete/{id}")
  public String deleteMeal(@PathVariable long id) {
    mealService.deleteMeal(id);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String editMeal(Model model, @PathVariable long id) {
    Meal meal = mealRepository.findById(id);
    model.addAttribute("meal", meal);
    model.addAttribute("mealtypes", mealTypeRepository.findAll());
    return "addOrEditMeal";
  }
}

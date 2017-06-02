package com.greenfox.dorinagy.caloriecounter.controller;

import com.greenfox.dorinagy.caloriecounter.repository.MealRepository;
import com.greenfox.dorinagy.caloriecounter.repository.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
@Controller
public class MainController {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  @GetMapping(value = "/")
  public String homePage(Model model) {
    model.addAttribute("meals", mealRepository.findAll());
    return "index";
  }

  @GetMapping(value = "/add")
  public String addMeal(Model model) {
    model.addAttribute("mealtypes", mealTypeRepository.findAll());
    return "addOrEditMeal";
  }
}

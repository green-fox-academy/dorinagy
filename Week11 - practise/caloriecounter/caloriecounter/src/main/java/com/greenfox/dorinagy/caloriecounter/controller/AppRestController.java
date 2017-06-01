package com.greenfox.dorinagy.caloriecounter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
@RestController
public class AppRestController {

  @GetMapping(value = "/edit")
  public String addOrEditMeal() {
    return "addOrEditMeal";
  }


}

package com.greenfox.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String showStaticPage() {
    return "index";
  }

  @RequestMapping(value = "/nutritionStore")
  public String showNutrition() {
    return "nutritionstore";
  }

  @RequestMapping(value = "/trickCenter")
  public String showTrickCenter() {
    return "trickcenter";
  }
}

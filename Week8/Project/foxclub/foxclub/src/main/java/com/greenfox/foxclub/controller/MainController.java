package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
@Controller
public class MainController {

  Fox fox;
  List<String> tricks;

  public MainController() {
    this.tricks = Arrays.asList("Code in Java", "Swim", "Do Karate", "Fly", "Cycle", "Write HTML", "Jump");
  }

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

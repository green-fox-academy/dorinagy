package com.greenfox.dorinagy.caloriecounter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
@Controller
public class MainController {

  @GetMapping
  public String homePage() {
  return "index";
}
}

package com.greenfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String index(Model model) {
    model.addAttribute("index");
    return "index";
  }
}

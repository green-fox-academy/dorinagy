package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
  public ModelAndView infoPage() {
    ModelAndView m = new ModelAndView();
    m.addObject(fox);
    m.setViewName("index");
    return m;
  }

  @RequestMapping(value = "/nutritionStore")
  public ModelAndView showNutrition() {
    ModelAndView m = new ModelAndView();
    m.setViewName("nutritionstore");
    return m;
  }

  @RequestMapping(value = "/trickCenter")
  public ModelAndView showTrickCenter() {
    ModelAndView m = new ModelAndView();
    m.addObject("tricks", tricks);
    m.setViewName("trickcenter");
    return m;
  }
}

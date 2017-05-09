package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
@Controller
public class MainController {

  String[] listOfTricks = {"Cycle", "Write HTML", "Code in Java", "Jump", "Swim", "Fly", "Dance", "Fight"};

  @Autowired
  Fox fox;

  @RequestMapping(value = "/")
  public ModelAndView infoPage(){
    ModelAndView m = new ModelAndView();
    m.addObject(fox);
    m.setViewName("index");
    return m;
  }

  @RequestMapping(value = "/nutritionStore")
  public ModelAndView nutritionStore(){
    ModelAndView m = new ModelAndView();
    m.addObject(fox);
    m.setViewName("nutritionstore");
    return m;
  }

  @RequestMapping(value = "/trickCenter")
  public ModelAndView trickCentre(){
    ModelAndView m = new ModelAndView();
    m.addObject(fox);
    List<String> remainingTricks = getRemainingTricks(listOfTricks);
    m.addObject("listOfTricks", remainingTricks);
    m.setViewName("trickcenter");
    return m;
  }

  private List<String> getRemainingTricks(String[] listOfTricks) {
    List<String> returnList = new ArrayList<>();
    for (String trick : listOfTricks ){
      if(!fox.knowsTrick(trick)) {
        returnList.add(trick);
      }
    }
    return returnList;
  }

  @RequestMapping(value = "/change-nutrition")
  public String addNutrition(@RequestParam String food, String drink){
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:";
  }

  @GetMapping(value = "/learn-trick")
  public String addTrick(@RequestParam String addTrick){
    fox.addTrick(addTrick);
    return "redirect:";
  }
}

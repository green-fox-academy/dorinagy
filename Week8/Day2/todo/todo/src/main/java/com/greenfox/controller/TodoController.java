package com.greenfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Nagy Dóra on 2017.05.09..
 */
@Controller
public class TodoController {

  @RequestMapping(value = "/list")
  @ResponseBody
  public String list(Model model) {
  return "This is my first todo.";
  }
}

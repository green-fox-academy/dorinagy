package com.greenfox.controller;

import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Nagy Dóra on 2017.05.09..
 */
@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepo;

  @RequestMapping(value = {"/", "/list"})
  public ModelAndView list(Model model) {
    ModelAndView m = new ModelAndView();
    m.setViewName("todo");
  return m;
  }
}

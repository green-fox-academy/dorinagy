package com.greenfox.mysql.controller;

import com.greenfox.mysql.model.Todo;
import com.greenfox.mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Nagy Dóra on 2017.05.09..
 */
@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepo;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepo.findAll());
    return "todo";
  }

  @RequestMapping(value = "/list/")
  public String active(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", todoRepo.findByIsDoneFalse());
    } else {
      model.addAttribute("todos", todoRepo.findAll());
    }
    return "todo";
  }

  @RequestMapping(value = "/add")
  public String addTodo() {
    return "add_todo";
  }

  @RequestMapping("/addtodo")
  public String addNew(String title) {
    todoRepo.save(new Todo(title));
    return "redirect:/todo/list";
  }
}

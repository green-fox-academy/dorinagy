package com.greenfox.mysql.controller;

import com.greenfox.mysql.model.Todo;
import com.greenfox.mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nagy Dóra on 2017.05.09..
 */
@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepo;

  @RequestMapping(value = {"/", "/list"})
  public String active(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", todoRepo.findByIsDoneFalse());
    } else {
      model.addAttribute("todos", todoRepo.findAll());
    }
    return "todo";
  }

  @GetMapping(value = "/add")
  public String addTodo(Model model) {
    model.addAttribute("todos", new Todo());
    return "add_todo";
  }

  @PostMapping(value = "/add")
  public String saveTodo(Todo todo) {
    todoRepo.save(todo);
    return "redirect:/todo/";
  }

  @RequestMapping("/addtodo")
  public String addNew(String title) {
    todoRepo.save(new Todo(title));
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/{id}/delete")
  public String removeTodo(@PathVariable("id") long id) {
    todoRepo.delete(id);
    return "redirect:/todo/list";
  }
}

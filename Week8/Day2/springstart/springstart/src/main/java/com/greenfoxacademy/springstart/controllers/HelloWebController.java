package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Nagy Dóra on 2017.05.02..
 */
@Controller
public class HelloWebController {

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam(value="name", defaultValue = "World") String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.incrementAndGet());
    return "greeting";
  }
}

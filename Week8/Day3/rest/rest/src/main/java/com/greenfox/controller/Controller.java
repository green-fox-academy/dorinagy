package com.greenfox.controller;
import com.greenfox.Append;
import com.greenfox.Doubling;

import com.greenfox.Greeter;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */

@RestController
public class Controller {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingError(MissingServletRequestParameterException e) {
    return "Missing parameter: " + e.getParameterName();
  }

  @RequestMapping(value = "/doubling")
  public Doubling doubling(@RequestParam(value = "input") Integer input) {
      return new Doubling(input, input * 2);
  }

  @RequestMapping(value = "/greeter")
  public Greeter greeter (@RequestParam(value = "name") String name, @RequestParam(value = "title") String title) {
    return new Greeter(name, title);
  }

  @RequestMapping("/appenda/{appendable}")
  public Append appenda(@PathVariable(value = "appendable", required = true) String input) {
    return new Append(input);
  }

  
}

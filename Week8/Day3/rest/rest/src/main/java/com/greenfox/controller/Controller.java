package com.greenfox.controller;
import com.greenfox.Doubling;

import com.greenfox.Greeter;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */

@RestController
public class Controller {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingInput() {
    return "error: " + "Please provide an input!";
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling doubling(@RequestParam(value = "input") int input) {
    return new Doubling(input, input * 2);
  }

  @RequestMapping(value = "/greeter")
  public Greeter greeter (@RequestParam(value = "name") String name, @RequestParam(value = "title") String title) {
    return new Greeter(name, title);
  }
}

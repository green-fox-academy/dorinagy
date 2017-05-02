package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nagy Dóra on 2017.05.02..
 */
@RestController
public class HelloRESTController {

  private static final String PRINT = "Hello, %s!";

  @RequestMapping(value="/greeting")
  public Greeting greeting(@RequestParam(value="name",defaultValue = "World") String name) {
    Greeting greeting = new Greeting(1, String.format(PRINT, name));
    return greeting;
  }
}

package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Nagy Dóra on 2017.05.02..
 */
@RestController
public class HelloRESTController {

  Greeting greeting;
  private static final String GREET = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    greeting = new Greeting(counter.incrementAndGet(), String.format(GREET, name));
    return greeting;
  }
}

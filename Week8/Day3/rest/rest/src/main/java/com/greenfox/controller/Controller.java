package com.greenfox.controller;

import com.greenfox.model.*;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */

@RestController
public class Controller {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String missingRequestParameterHandler(MissingServletRequestParameterException e) {
    return String.format("Please provide %s!", e.getParameterName());
  }

  @RequestMapping(value = "/doubling")
  public ResponseObject doubling(@RequestParam(value = "input") Integer input) {
    return new Doubling(input, input * 2);
  }

  @RequestMapping(value = "/greeter")
  public ResponseObject greeter(@RequestParam String name, @RequestParam String title) {
    return new Greeter(name, title);
  }

  @RequestMapping(value = "/appenda/{appendable}")
  public ResponseObject appenda(@PathVariable(value = "appendable") String appendable) {
    return new Append(appendable);
  }

  @RequestMapping(value = "/dountil/{what}")
  public ResponseObject dountil(@RequestBody Dountil dountil, @PathVariable(value = "what") String what) {
    if (dountil.notNegative()) {
      if (what.equals("sum")) {
        dountil.sum();
      } else if (what.equals("factor")) {
        dountil.factor();
      } else {
        return new ErrorMessage("Please enter 'sum' or 'factor'!");
      }
    } else {
      return new ErrorMessage("Please provide a number!");
    }
    return dountil;
  }
}

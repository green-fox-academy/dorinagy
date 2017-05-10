package com.greenfox.controller;
import com.greenfox.Doubling;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */

@RestController
public class Controller {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  @ResponseBody
  public String handleMissingInput() {
    return "error: " + "Please provide an input!";
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  @ResponseBody
  public Doubling doubling(@RequestParam(value = "input") int input) {
    Doubling output = new Doubling(input, input * 2);
    return output;
  }
}

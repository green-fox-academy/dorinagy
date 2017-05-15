package com.greenfox.dorinagy.groot.controller;

import com.greenfox.dorinagy.groot.model.ErrorMessage;
import com.greenfox.dorinagy.groot.model.Message;
import com.greenfox.dorinagy.groot.service.ResponseMessage;
import com.greenfox.dorinagy.groot.model.Speed;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ResponseMessage missingRequestParameterHandler(MissingServletRequestParameterException e) {
    return new ErrorMessage("I am Groot!");
  }

  @GetMapping(value = "/groot")
  public ResponseMessage groot(@RequestParam(value = "message", required = true) String message) {
    if (message.equals("")) {
      return new ErrorMessage("I am Groot!");
    }
    return new Message(message);
  }

  @GetMapping(value = "/yondu")
  public ResponseMessage yondu(@RequestParam(value = "distance") double distance, @RequestParam(value = "time") double time) {
    if (distance == 0 || time == 0) {
      return new ErrorMessage("Distance or Time cannot be zero!");
    }
    return new Speed(distance, time);
  }
}

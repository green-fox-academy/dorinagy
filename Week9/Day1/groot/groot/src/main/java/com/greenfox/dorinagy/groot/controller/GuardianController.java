package com.greenfox.dorinagy.groot.controller;

import com.greenfox.dorinagy.groot.model.ErrorMessage;
import com.greenfox.dorinagy.groot.model.Message;
import com.greenfox.dorinagy.groot.model.ResponseMessage;
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
  public ResponseMessage missingRequestParameterHandler() {
    return new ErrorMessage();
  }

  @GetMapping(value = "/groot")
  public ResponseMessage groot(@RequestParam(value = "message") String message) {
    return new Message(message);
  }
}

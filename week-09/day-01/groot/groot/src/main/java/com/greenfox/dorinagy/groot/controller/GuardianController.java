package com.greenfox.dorinagy.groot.controller;

import com.greenfox.dorinagy.groot.model.*;
import com.greenfox.dorinagy.groot.service.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
@RestController
public class GuardianController {

  List<Food> foodList;

  @Autowired
  CalorieTable calorieTable;

  @Autowired
  Rocket rocket;

  @Autowired
  FillRocket fillRocket;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ResponseMessage missingRequestParameterHandler() {
    return new ErrorMessage("I am Groot!");
  }

  @GetMapping(value = "/groot")
  public ResponseMessage groot(@RequestParam(value = "message", required = true) String message) {
    if (message.equals("")) {
      return new ErrorMessage("I am Groot!");
    }
    return new Groot(message);
  }

  @GetMapping(value = "/yondu")
  public ResponseMessage calculateSpeed(@RequestParam(value = "distance") double distance, @RequestParam(value = "time") double time) {
    if (distance == 0 || time == 0) {
      return new ErrorMessage("Distance or Time cannot be zero!");
    }
    return new Arrow(distance, time);
  }

  @GetMapping(value = "/rocket")
  public ResponseMessage cargo() {
    rocket.setCargoStatus();
    rocket.setReady();
    return rocket;
  }

  @GetMapping(value = "/rocket/fill")
  public ResponseMessage fillRocket(@RequestParam(value = "caliber") String caliber, @RequestParam(value = "amount") Integer amount) {
    if (caliber == null || amount == null) {
      return new ErrorMessage("Caliber or Amount cannot be null!");
    }
    rocket.fillRocket(caliber, amount);
    rocket.setCargoStatus();
    rocket.setReady();
    fillRocket.setReceived(caliber);
    fillRocket.setAmount(amount);
    fillRocket.setShipstatus(amount);
    fillRocket.setReady();
    return fillRocket;
  }

  @GetMapping(value = "/drax")
  public ResponseMessage calorieTable() {
    return calorieTable;
  }

  @GetMapping(value = "/drax/add")
  public ResponseMessage addFood(@RequestParam(value = "food") String food) {
    //foodList.add(new Food(food));
    calorieTable.setFoodList(foodList);
    calorieTable.addFood(food);
    return calorieTable;
  }
}

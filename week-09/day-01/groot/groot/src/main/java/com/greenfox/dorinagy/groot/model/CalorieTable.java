package com.greenfox.dorinagy.groot.model;

import com.greenfox.dorinagy.groot.service.ResponseMessage;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
@Component
public class CalorieTable implements ResponseMessage {
  private List<Food> foodList;

  public void addFood(String newFood) {
    foodList.add(new Food(newFood));
  }

  public List<Food> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<Food> foodList) {
    this.foodList = foodList;
  }
}

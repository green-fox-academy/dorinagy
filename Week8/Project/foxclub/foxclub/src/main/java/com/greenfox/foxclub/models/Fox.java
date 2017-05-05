package com.greenfox.foxclub.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
public class Fox {

  private String name;
  private List<String> trickList;
  private String food;
  private String drink;

  public Fox() {
    this.name = "Mr Fox";
    this.trickList = new ArrayList<>();
    this.food = "nothing";
    this.drink = "nothing";
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void setTrickList(List trickList) {
    this.trickList = trickList;
  }

  public String getName() {
    return name;
  }

  public List getTrickList() {
    return trickList;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void addTrick(String trick) {
    trickList.add(trick);
  }
}

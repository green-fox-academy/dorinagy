package com.greenfox.foxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
public class Fox {

  private String name;
  private List<String> listOfTricks;
  private String food;
  private String drink;

  public Fox() {
    this.name = "Mr Fox";
    listOfTricks = new ArrayList<>();
    this.food = "Apple";
    this.drink = "Water";
  }

  public void addTrick(String trick) {
    listOfTricks.add(trick);
  }

  public int knownTricks() {
    return listOfTricks.size();
  }

  public boolean knowsTrick(String trick) {
    for (String trickElement : listOfTricks) {
      if (trickElement.equals(trick)) {
        return true;
      }
    }
    return false;
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

  public void setTrickList(ArrayList listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public String getName() {
    return name;
  }

  public List getTrickList() {
    return listOfTricks;
  }

  public int getTrickListSize() {
    return listOfTricks.size();
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }
}

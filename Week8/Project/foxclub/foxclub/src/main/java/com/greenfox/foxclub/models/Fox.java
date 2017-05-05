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

  public void addTrick(String trick) {
    trickList.add(trick);
  }
}

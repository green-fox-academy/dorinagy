package com.greenfox.model;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class Greeter implements ResponseObject {

  private String welcome_message;

  public Greeter(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}

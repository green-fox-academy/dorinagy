package com.greenfox;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class Greeter {

  private String welcome_message;

  public Greeter(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear student!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}

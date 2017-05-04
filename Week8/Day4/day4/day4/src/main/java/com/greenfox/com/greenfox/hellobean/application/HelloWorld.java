package com.greenfox.com.greenfox.hellobean.application;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
public class HelloWorld {

  private String message;

  public void setMessage(String message){
    this.message  = message;
  }

  public String getMessage(){
    System.out.println("Your message: " + message);
    return message;
  }
}

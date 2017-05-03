package com.greenfox.hellobean;

/**
 * Created by Nagy Dóra on 2017.05.03..
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

package com.greenfoxacademy.springstart;

import lombok.Getter;

/**
 * Created by Nagy Dóra on 2017.05.02..
 */
@Getter
public class Greeting {
  long id;
  String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }
}

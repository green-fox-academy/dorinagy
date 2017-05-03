package com.greenfoxacademy.bankaccount.model;

import lombok.Getter;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
public class BankAccount {

  String name;
  Integer balance;
  String animalType;

  public BankAccount(String name, Integer balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public String animalType() {
    return animalType;
  }

  public int balance() {
    return balance;
  }
}

package com.greenfoxacademy.bankaccount.model;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
public class BankAccount7 {
  String name;
  String balance;
  String animalType;
  boolean isKing;

  public BankAccount7(String name, String balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
  }

  public boolean isKing() {
    return isKing;
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getBalance() {
    return balance;
  }
}

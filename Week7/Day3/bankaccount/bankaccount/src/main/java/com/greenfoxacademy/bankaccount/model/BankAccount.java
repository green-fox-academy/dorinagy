package com.greenfoxacademy.bankaccount.model;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
public class BankAccount {

  String name;
  String balance;
  String animalType;

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
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

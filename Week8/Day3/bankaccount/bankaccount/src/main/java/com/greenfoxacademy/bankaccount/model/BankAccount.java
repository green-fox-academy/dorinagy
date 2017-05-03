package com.greenfoxacademy.bankaccount.model;

import lombok.Getter;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
public class BankAccount {

  @Getter
  String name;
  @Getter
  String balance;
  @Getter
  String animalType;

  public BankAccount(String name, String animalType, String balance) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
}

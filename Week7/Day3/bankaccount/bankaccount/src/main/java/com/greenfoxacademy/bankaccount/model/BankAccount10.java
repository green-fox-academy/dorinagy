package com.greenfoxacademy.bankaccount.model;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
public class BankAccount10 {

  String name;
  String balance;
  String animalType;
  boolean isKing;
  boolean isBad;

  public BankAccount10(String name, String balance, String animalType, boolean isKing, boolean isBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isBad = isBad;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isBad() {
    return isBad;
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

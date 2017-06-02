package com.greenfox.dorinagy.caloriecounter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
@Entity
public class MealType {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String type;

  public MealType() {
  }

  public MealType(String type) {
    this.type = type;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

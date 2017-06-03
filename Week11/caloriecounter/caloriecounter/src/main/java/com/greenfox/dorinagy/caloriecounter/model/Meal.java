package com.greenfox.dorinagy.caloriecounter.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
@Entity
public class Meal {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @NotNull(message = "The date field is empty.")
  private Date date;

  @NotNull(message = "The meal type field is empty. ")
  private String mealType;

  private String description;

  @NotNull(message = "The calories field is empty.")
  @Min(value = 1, message = "The calories field is empty.")
  private int calories;

  public Meal() {
  }

  public Meal(Date date, String mealType, String description, int calories) {
    this.date = date;
    this.mealType = mealType;
    this.description = description;
    this.calories = calories;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getMealType() {
    return mealType;
  }

  public void setMealType(String type) {
    this.mealType = mealType;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}

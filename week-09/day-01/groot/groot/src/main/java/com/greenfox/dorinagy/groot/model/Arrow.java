package com.greenfox.dorinagy.groot.model;

import com.greenfox.dorinagy.groot.service.ResponseMessage;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
public class Arrow implements ResponseMessage {
  private double distance;
  private double time;
  private double speed;

  public Arrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance / time;
  }

  public double getDistance() {
    return distance;
  }

  public double getTime() {
    return time;
  }

  public double getSpeed() {
    return speed;
  }
}

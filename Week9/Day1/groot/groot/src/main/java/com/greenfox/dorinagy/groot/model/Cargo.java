package com.greenfox.dorinagy.groot.model;

import com.greenfox.dorinagy.groot.service.ResponseMessage;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
public class Cargo implements ResponseMessage {

  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipstatus;
  private boolean ready;

  public Cargo() {
    caliber25 = 0;
    caliber30 = 0;
    caliber50 = 0;
    shipstatus = "empty";
    ready = false;
  }

  public int getCaliber25() {
    return caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public boolean isReady() {
    return ready;
  }
}
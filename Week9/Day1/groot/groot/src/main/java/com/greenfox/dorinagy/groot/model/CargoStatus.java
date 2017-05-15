package com.greenfox.dorinagy.groot.model;

import com.greenfox.dorinagy.groot.service.ResponseMessage;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
public class CargoStatus implements ResponseMessage {

  private String received;
  private int amount;
  private int shipstatus;
  private boolean ready = false;

  public CargoStatus(String caliber, int amount) {
    received = caliber;
    this.amount = amount;
    shipstatus = amount * 100 / 12500;
    ready = getShipstatus().equals("full");
  }

  public String getReceived() {
    return received;
  }

  public int getAmount() {
    return amount;
  }

  public String getShipstatus() {
    if (shipstatus == 0) {
      return "empty";
    } else if (shipstatus == 100) {
      return "full";
    } else if (shipstatus > 100) {
      return "overloaded";
    } else {
      return String.format("%d%%", shipstatus);
    }
  }

  public boolean isReady() {
    return ready;
  }
}

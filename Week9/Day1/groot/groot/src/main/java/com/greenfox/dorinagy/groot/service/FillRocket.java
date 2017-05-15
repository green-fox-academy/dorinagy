package com.greenfox.dorinagy.groot.service;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
public class FillRocket implements ResponseMessage {

  private String received;
  private int amount;
  private String shipstatus;
  private boolean ready = false;

  public FillRocket(String caliber, int amount) {
   this.received = caliber;
   this.amount = amount;

   if(amount == 0) {
     this.shipstatus = "empty";
   } else if(amount > 0 && amount < 12500) {
      this.shipstatus = (amount / 12500 * 100) + "%";
   } else
     this.shipstatus = "overloaded";
  }

  public String getReceived() {
    return received;
  }

  public int getAmount() {
    return amount;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public boolean isReady() {
    return ready;
  }
}

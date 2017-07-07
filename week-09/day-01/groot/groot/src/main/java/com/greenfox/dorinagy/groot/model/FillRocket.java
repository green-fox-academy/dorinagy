package com.greenfox.dorinagy.groot.model;

import com.greenfox.dorinagy.groot.service.ResponseMessage;
import org.springframework.stereotype.Component;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
@Component
public class FillRocket implements ResponseMessage {

  private String received;
  private int amount;
  private String shipstatus;
  private boolean ready;

  public void setShipstatus(float amount) {
    float maxAmmo = 12500;
    if (amount <= 0) {
      shipstatus = "empty";
    } else if (amount < maxAmmo && amount > 0) {
      float shipstatusNumber = (amount / maxAmmo) * 100;
      shipstatus = (int)shipstatusNumber + "%";
    } else if(amount == maxAmmo) {
      shipstatus = "full";
    } else {
      shipstatus = "overloaded";
    }
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady() {
    ready = shipstatus.equals("full");
  }
}

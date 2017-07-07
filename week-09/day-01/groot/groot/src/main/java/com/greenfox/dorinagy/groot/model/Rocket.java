package com.greenfox.dorinagy.groot.model;

import com.greenfox.dorinagy.groot.service.ResponseMessage;
import org.springframework.stereotype.Component;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
@Component
public class Rocket implements ResponseMessage {

  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipstatus;
  private boolean ready;

  public Rocket() {
    caliber25 = 0;
    caliber30 = 0;
    caliber50 = 0;
    shipstatus = "empty";
    ready = false;
  }

  public void fillRocket(String caliber, int amount) {
    if (caliber.equals(".25")) {
      caliber25 += amount;
    } else if (caliber.equals(".30")) {
      caliber30 += amount;
    } else if (caliber.equals(".50")) {
      caliber50 += amount;
    } else {
      new ErrorMessage("error");
    }
  }

  public int getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setCargoStatus() {
    int fullAmmoAmount = caliber25 + caliber30 + caliber50;
    float maxAmmo = 12500;
    if (fullAmmoAmount <= 0) {
      shipstatus = "empty";
    } else if (fullAmmoAmount < maxAmmo && fullAmmoAmount > 0) {
      float shipstatusNumber = (fullAmmoAmount / maxAmmo) * 100;
      shipstatus = (int) shipstatusNumber + "%";
    } else if (fullAmmoAmount == maxAmmo) {
      shipstatus = "full";
    } else {
      shipstatus = "overloaded";
    }
  }

  public void setReady() {
    if (shipstatus.equals("full")) {
      ready = true;
    } else
      ready = false;
  }
}

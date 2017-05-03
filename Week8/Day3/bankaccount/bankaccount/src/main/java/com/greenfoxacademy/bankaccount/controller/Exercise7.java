package com.greenfoxacademy.bankaccount.controller;

import com.greenfoxacademy.bankaccount.model.BankAccount;
import com.greenfoxacademy.bankaccount.model.BankAccount7;
import com.greenfoxacademy.bankaccount.model.BankAccount8;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
@Controller
public class Exercise7 {

  @RequestMapping(value = "/exercise7")
  public String bankAccountList(Model model){
    List<BankAccount7> accountList = new ArrayList<>();
    accountList.add(new BankAccount7("Zordon", String.format("%s.00", 4000), "lion", false));
    accountList.add(new BankAccount7("Mufasa", String.format("%s.00", 400), "lion", true));
    accountList.add(new BankAccount7("Pumbaa", String.format("%s.00", 500), "warthog", false));
    accountList.add(new BankAccount7("Timon", String.format("%s.00", 200), "meerkat", false));
    accountList.add(new BankAccount7("Rafiki", String.format("%s.00", 540), "mandrill", false));
    accountList.add(new BankAccount7("Simba", String.format("%s.00", 300), "lion", true));
    model.addAttribute("accountList", accountList);
    return "exercise7";
  }
}

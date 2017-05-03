package com.greenfoxacademy.bankaccount.controller;

import com.greenfoxacademy.bankaccount.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
@Controller
public class Exercise5 {

  @RequestMapping(value = "/exercise5")
  public String bankAccountList(Model model){
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("Zordon", String.format("%s.00", 4000), "lion"));
    accountList.add(new BankAccount("Mufasa", String.format("%s.00", 400), "lion"));
    accountList.add(new BankAccount("Pumbaa", String.format("%s.00", 500), "warthog"));
    accountList.add(new BankAccount("Timon", String.format("%s.00", 200), "meerkat"));
    accountList.add(new BankAccount("Rafiki", String.format("%s.00", 540), "mandrill"));
    model.addAttribute("accountList", accountList);
    return "exercise5";
  }
}

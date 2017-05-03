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
    accountList.add(new BankAccount("Muffin", String.format("%s.00", 4000), "dog"));
    accountList.add(new BankAccount("Harold", String.format("%s.00", 400), "rabbit"));
    accountList.add(new BankAccount("Lei", String.format("%s.00", 500), "turtle"));
    accountList.add(new BankAccount("Mao", String.format("%s.00", 200), "cat"));
    accountList.add(new BankAccount("Albert", String.format("%s.00", 540), "parrot"));
    model.addAttribute("accountList", accountList);
    return "exercise5";
  }
}

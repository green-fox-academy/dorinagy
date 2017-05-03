package com.greenfoxacademy.bankaccount.controller;

import com.greenfoxacademy.bankaccount.model.BankAccount;
import com.greenfoxacademy.bankaccount.model.BankAccount7;
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
    accountList.add(new BankAccount7("Muffin", String.format("%s.00", 4000), "dog", false));
    accountList.add(new BankAccount7("Harold", String.format("%s.00", 400), "rabbit", false));
    accountList.add(new BankAccount7("Lei", String.format("%s.00", 500), "turtle", false));
    accountList.add(new BankAccount7("Mao", String.format("%s.00", 200), "cat", false));
    accountList.add(new BankAccount7("Albert", String.format("%s.00", 540), "parrot", false));
    accountList.add(new BankAccount7("Simba", String.format("%s.00", 30), "King", true));
    model.addAttribute("accountList", accountList);
    return "exercise7";
  }
}

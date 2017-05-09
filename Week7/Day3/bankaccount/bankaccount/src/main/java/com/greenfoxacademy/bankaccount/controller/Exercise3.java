package com.greenfoxacademy.bankaccount.controller;

import com.greenfoxacademy.bankaccount.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
@Controller
public class Exercise3 {

  @RequestMapping(value = "/exercise3")
  public String showAccount(Model model) {
    BankAccount account = new BankAccount("Simba", String.format("%s.00", 2000), "lion");
    model.addAttribute("account", account);
    return "exercise3";
  }
}

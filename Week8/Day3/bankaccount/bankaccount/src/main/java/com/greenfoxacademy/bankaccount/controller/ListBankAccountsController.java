package com.greenfoxacademy.bankaccount.controller;

import com.greenfoxacademy.bankaccount.model.BankAccount;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
public class ListBankAccountsController {

  @RequestMapping("/exercise5")
  public String bankAccountList(Model model){
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("Muffin", 4000, "dog"));
    accountList.add(new BankAccount("Harold", 400, "rabbit"));
    accountList.add(new BankAccount("Lei", 500, "turtle"));
    accountList.add(new BankAccount("Mao", 200, "cat"));
    accountList.add(new BankAccount("Albert", 540, "parrot"));
    model.addAttribute("accountList", accountList);
    return "ListAccounts";
  }
}

package com.greenfoxacademy.bankaccount.controller;

import com.greenfoxacademy.bankaccount.model.BankAccount9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
@Controller
public class Exercise9 {

  @RequestMapping(value = "/exercise9")
  public String bankAccountList(Model model){
    List<BankAccount9> accountList = new ArrayList<>();
    accountList.add(new BankAccount9("Zordon", String.format("%s.00", 4000), "lion", false, true));
    accountList.add(new BankAccount9("Mufasa", String.format("%s.00", 400), "lion", true, false));
    accountList.add(new BankAccount9("Pumbaa", String.format("%s.00", 500), "warthog", false, false));
    accountList.add(new BankAccount9("Timon", String.format("%s.00", 200), "meerkat", false, false));
    accountList.add(new BankAccount9("Rafiki", String.format("%s.00", 540), "mandrill", false, false));
    accountList.add(new BankAccount9("Simba", String.format("%s.00", 300), "lion", true, false));
    model.addAttribute("accountList", accountList);
    return "exercise9";
  }
}

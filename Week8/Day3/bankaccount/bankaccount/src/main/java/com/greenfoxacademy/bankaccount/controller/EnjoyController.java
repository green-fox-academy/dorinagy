package com.greenfoxacademy.bankaccount.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
@Controller
public class EnjoyController {

  @RequestMapping(value = "/exercise4")
  public String textUtext(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "Enjoy";
  }
}

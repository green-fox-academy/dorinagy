package com.greenfox.foxclub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
@Controller
public class FoxClubController {

  @RequestMapping(value = "")
  public String showStaticPage() {
    return "index";
  }
}

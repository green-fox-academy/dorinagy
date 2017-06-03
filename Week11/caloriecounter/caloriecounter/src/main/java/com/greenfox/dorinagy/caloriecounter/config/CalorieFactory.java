package com.greenfox.dorinagy.caloriecounter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Nagy Dóra on 2017.06.03..
 */
@Configuration
public class CalorieFactory {

  @Bean
  public ModelAndView getModelAndView() {
    return new ModelAndView();
  }
}

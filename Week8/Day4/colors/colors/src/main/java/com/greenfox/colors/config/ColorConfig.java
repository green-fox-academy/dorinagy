package com.greenfox.colors.config;

import com.greenfox.colors.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
@Configuration
public class ColorConfig {

  @Bean
  public RedColor redColor() {
    return new RedColor();
  }
}

package com.greenfox.foxclub.configuration;

import com.greenfox.foxclub.models.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
@Configuration
public class FoxConfig {
  @Bean
  public Fox fox() {
    return new Fox();
  }
}

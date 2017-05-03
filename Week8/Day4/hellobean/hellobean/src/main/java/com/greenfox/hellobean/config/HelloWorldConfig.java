package com.greenfox.hellobean.config;

import com.greenfox.hellobean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Nagy Dóra on 2017.05.03..
 */
@Configuration
public class HelloWorldConfig {

  @Bean
  public HelloWorld helloWorld(){
    return new HelloWorld();
  }
}

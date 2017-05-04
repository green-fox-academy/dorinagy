package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.MessageProceeder;
import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageService;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
@Configuration
public class MessageConfiguration {

  @Bean
  public EmailService getEmailService() {
    return new EmailService();
  }

  @Bean
  public TwitterService getTwitterService() {
    return new TwitterService();
  }

  @Bean
  @Primary
  public MessageProceeder getEmailProceeder() {
    return new MessageProceeder(getEmailService());
  }

  @Bean
  public MessageProceeder getTwitterProceeder() {
    return new MessageProceeder(getTwitterService());
  }
}

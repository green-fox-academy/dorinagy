package com.greenfox.colors;

import com.greenfox.colors.config.BlueColor;
import com.greenfox.colors.config.ColorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Nagy Dóra on 2017.05.04..
 */
@SpringBootApplication
public class ColorApp {

  public static void main(String[] args) {
    SpringApplication.run(ColorApp.class, args);

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ColorConfig.class);

    RedColor redColor = ctx.getBean(RedColor.class);
    redColor.printColor();
    BlueColor blueColor = ctx.getBean(BlueColor.class);
    blueColor.printColor();
  }
}

package com.greenfox.foxclub;

import com.greenfox.foxclub.configuration.FoxConfig;
import com.greenfox.foxclub.models.Fox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(FoxConfig.class);

		Fox fox = ctx.getBean(Fox.class);

	}
}

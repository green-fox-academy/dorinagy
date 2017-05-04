package com.greenfox.foxclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class FoxclubApplication {

	@RequestMapping(value = "")
	public String showStaticPage() {
		return "index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(FoxclubApplication.class, args);
	}
}

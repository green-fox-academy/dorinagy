package com.greenfox.mysql;

import com.greenfox.mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication {

	@Autowired
	TodoRepository todoRepo;


	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}
}

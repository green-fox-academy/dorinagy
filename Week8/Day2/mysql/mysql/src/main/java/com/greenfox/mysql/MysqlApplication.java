package com.greenfox.mysql;

import com.greenfox.mysql.model.Todo;
import com.greenfox.mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepo;


	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepo.save(new Todo("I have to learn Object Relational Mapping"));
	}
}

package com.greenfox.mysql.repository;

import com.greenfox.mysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Nagy Dóra on 2017.05.09..
 */
@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
}

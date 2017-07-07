package com.greenfox.repository;

import com.greenfox.todo.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Nagy Dóra on 2017.05.09..
 */
@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
}

package com.greenfox.todo.repository;

import com.greenfox.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nagy Dóra on 2017.05.09..
 */
public interface TodoRepository extends CrudRepository<Todo, Long> {

}

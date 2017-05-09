package com.greenfox.mysql.repository;

import com.greenfox.mysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.09..
 */
@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findByIsDoneTrue();

  List<Todo> findByIsDoneFalse();

}

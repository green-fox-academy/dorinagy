package com.greenfox.dorinagy.caloriecounter;

import com.greenfox.dorinagy.caloriecounter.model.Meal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
public interface MealRepository extends CrudRepository<Meal, Long> {
}

package com.greenfox.dorinagy.reddit.service;

import com.greenfox.dorinagy.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nagy Dóra on 2017.05.12..
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}

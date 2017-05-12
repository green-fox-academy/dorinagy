package com.greenfox.dorinagy.reddit.model;

import com.greenfox.dorinagy.reddit.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Nagy Dóra on 2017.05.12..
 */
@Component
public class PostList {

  private Iterable<Post> posts;

  @Autowired
  PostRepository postRepository;

  public void fillPostList() {
    posts = postRepository.findAll();
  }
}

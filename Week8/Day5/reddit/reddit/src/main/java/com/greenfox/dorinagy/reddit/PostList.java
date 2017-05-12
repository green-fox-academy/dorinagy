package com.greenfox.dorinagy.reddit;

import com.greenfox.dorinagy.reddit.model.Post;
import com.greenfox.dorinagy.reddit.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Nagy Dóra on 2017.05.12..
 */
public class PostList {

  private Iterable<Post> posts;

  @Autowired
  PostRepository postRepository;

  public void preparePostList() {
    posts = postRepository.findAll();
  }
}

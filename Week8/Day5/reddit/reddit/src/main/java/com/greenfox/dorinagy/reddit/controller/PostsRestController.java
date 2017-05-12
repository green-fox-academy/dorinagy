package com.greenfox.dorinagy.reddit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;im
import com.greenfox.dorinagy.reddit.service.PostRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Nagy Dóra on 2017.05.12..
 */
@RestController
public class PostsRestController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Iterable listPosts() {
    return postRepository.findAll();
  }
}

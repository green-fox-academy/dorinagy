package com.greenfox.dorinagy.reddit.controller;

import com.greenfox.dorinagy.reddit.model.Post;
import com.greenfox.dorinagy.reddit.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

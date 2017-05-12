package com.greenfox.dorinagy.reddit.controller;

import com.greenfox.dorinagy.reddit.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
  public Iterable<Post> listPosts() {
    return postRepository.findAll();
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPosts(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }
}

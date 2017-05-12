package com.greenfox.dorinagy.reddit.controller;

import com.greenfox.dorinagy.reddit.model.PostList;
import com.greenfox.dorinagy.reddit.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.greenfox.dorinagy.reddit.service.PostRepository;

/**
 * Created by Nagy Dóra on 2017.05.12..
 */
@RestController
public class PostsRestController {

  @Autowired
  PostRepository postRepository;
  PostList postList;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public PostList listPosts() {
    postList.fillPostList();
    return postList;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPosts(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }

  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Post downvote(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.downVote();
    postRepository.save(post);
    return post;
  }

  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Post upvote(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.upVote();
    postRepository.save(post);
    return post;
  }
}

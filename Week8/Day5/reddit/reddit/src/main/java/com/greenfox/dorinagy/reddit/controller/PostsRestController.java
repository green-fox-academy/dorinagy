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

  @GetMapping(value = "/posts")
  public PostList listPosts() {
    PostList postList = new PostList();
    postList.setPosts(postRepository.findAll());
    return postList;
  }

  @PostMapping(value = "/posts")
  public Post addPosts(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }

  @PutMapping(value = "/posts/{id}/downvote")
  public Post downvote(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.downVote();
    postRepository.save(post);
    return post;
  }

  @PutMapping(value = "/posts/{id}/upvote")
  public Post upvote(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.upVote();
    postRepository.save(post);
    return post;
  }
}

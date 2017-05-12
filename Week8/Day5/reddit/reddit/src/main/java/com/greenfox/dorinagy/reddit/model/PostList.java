package com.greenfox.dorinagy.reddit.model;

/**
 * Created by Nagy Dóra on 2017.05.12..
 */
public class PostList {

  private Iterable<Post> posts;

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}

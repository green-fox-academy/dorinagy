package com.greenfox.dorinagy.reddit.controller;

import com.greenfox.dorinagy.reddit.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by Nagy Dóra on 2017.05.12..
 */
@Controller
@CrossOrigin("*")
public class PostsController {

  @Autowired
  PostRepository postRepository;

}

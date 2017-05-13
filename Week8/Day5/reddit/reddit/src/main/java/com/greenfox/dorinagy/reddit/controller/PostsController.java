package com.greenfox.dorinagy.reddit.controller;

import com.greenfox.dorinagy.reddit.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nagy Dóra on 2017.05.12..
 */
@Controller
public class PostsController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping(value = "/")
  public String home(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "index";
  }
}

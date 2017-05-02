package controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nagy Dóra on 2017.05.02..
 */
@RestController
public class HelloRESTController {

  @RequestMapping(value="/greeting")
  public Greeting greeting() {
    Greeting greeting = new Greeting(1, "Hello world!");
    return greeting;
  }
}

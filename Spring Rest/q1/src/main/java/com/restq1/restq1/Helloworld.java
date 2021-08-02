package com.restq1.restq1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
  
  @RequestMapping("/hello")
  String home() {
    return "Hello World!";
  }
}
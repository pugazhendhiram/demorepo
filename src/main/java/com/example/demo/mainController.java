package com.example.demo;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
	  @RequestMapping(method=RequestMethod.GET,path="/test2")
      public String retrunString() {
    	  return "Hi how are you";
      }
}

package com.example.application;

import com.example.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriberController {

  @GetMapping("/subscriber")
  public Subscriber Get() {
    System.out.println("subscriber endpoint accessed!");
    return Subscriber.parse("test@example.com", "Test Name");
  }
}

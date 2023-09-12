package com.example.models;

import com.example.domain.SubscriberEmail;

public class Subscriber {

  private SubscriberEmail email;
  private String name;

  private Subscriber(String emailIn, String nameIn) {
    email = SubscriberEmail.parse(emailIn);
    name = nameIn;
  }

  public static Subscriber parse(String emailIn, String nameIn) {
    var subscriber = new Subscriber(emailIn, nameIn);

    if (subscriber.getEmail() == null) {
      return null;
    }

    return subscriber;
  }

  public SubscriberEmail getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }
}

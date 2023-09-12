package com.example.domain;

public class SubscriberEmail {
  private String email;

  private SubscriberEmail(String emailIn) {
    email = emailIn;
  }

  public static SubscriberEmail parse(String emailIn) {
    if (emailIn.contains("@")) {
      return new SubscriberEmail(emailIn);
    }
    return null;
  }

  public String getValue() {
    return email;
  }
}

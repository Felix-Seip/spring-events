package com.tutorial.felixseip.springevents.events;

import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {

  private User user;

  public UserCreatedEvent(Object source, User user) {
    super(source);
    this.user = user;
  }

  public User getUser() {
    return this.user;
  }

}

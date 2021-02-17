package com.tutorial.felixseip.springevents.events.listener;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

import com.tutorial.felixseip.springevents.events.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserEventListener {

  @PrePersist
  public void beforeUserCreated(User user) {
    log.info("user with firstName " + user.getFirstName() + " and lastName " + user.getLastName() + " is about to be saved in DB");
  }

  @PostPersist
  public void afterUserCreated(User user) {
    log.info("user" + user.getId() + " was created - sending confirmation email");
  }

}

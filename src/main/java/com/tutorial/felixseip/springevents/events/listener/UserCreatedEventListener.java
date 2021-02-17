package com.tutorial.felixseip.springevents.events.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.tutorial.felixseip.springevents.events.UserCreatedEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserCreatedEventListener implements ApplicationListener<UserCreatedEvent> {
  @Override
  public void onApplicationEvent(UserCreatedEvent userCreatedEvent) {
    log.info("user created - sending confirmation email");
  }
}

package com.tutorial.felixseip.springevents.events.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.tutorial.felixseip.springevents.events.UserCreatedEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserCreatedEventPublisher {

  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  public void publishEmailNotificationEvent(UserCreatedEvent userCreatedEvent) {
    log.info("publishing user created event");
    applicationEventPublisher.publishEvent(userCreatedEvent);
  }

}

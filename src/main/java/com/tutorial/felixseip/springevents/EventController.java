package com.tutorial.felixseip.springevents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutorial.felixseip.springevents.events.User;
import com.tutorial.felixseip.springevents.events.UserCreatedEvent;
import com.tutorial.felixseip.springevents.events.publisher.UserCreatedEventPublisher;
import com.tutorial.felixseip.springevents.events.repository.UserRepository;

@Controller
@RequestMapping("/api/events")
public class EventController {

  @Autowired
  private UserCreatedEventPublisher userCreatedEventPublisher;

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/publisher")
  public void publishEventWithSpringEventPublisher()  {
    UserCreatedEvent userCreatedEvent = new UserCreatedEvent(this, User.builder().firstName("firstName").lastName("lastName")
        .emailAddress("firstName@lastName.com").build());
    userCreatedEventPublisher.publishEmailNotificationEvent(userCreatedEvent);
  }

  @GetMapping("/jpa")
  public void publishEventListener() {
    userRepository.save(User.builder().firstName("firstName").lastName("lastName").emailAddress("firstName@lastName.com").build());
  }

}

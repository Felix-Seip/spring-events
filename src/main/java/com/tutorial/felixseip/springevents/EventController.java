package com.tutorial.felixseip.springevents;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/api/events")
public class EventController {

  @GetMapping("/publisher")
  public void publishEventWithSpringEventPublisher()  {

  }

  @GetMapping("/jpa")
  public void publishEventListener() {

  }

}

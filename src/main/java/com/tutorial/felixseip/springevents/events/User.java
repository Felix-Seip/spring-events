package com.tutorial.felixseip.springevents.events;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.tutorial.felixseip.springevents.events.listener.UserEventListener;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@EntityListeners(UserEventListener.class)
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String emailAddress;

}

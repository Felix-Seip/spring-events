package com.tutorial.felixseip.springevents.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.felixseip.springevents.events.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

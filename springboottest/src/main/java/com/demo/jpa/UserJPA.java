package com.demo.jpa;

import com.demo.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPA extends JpaRepository<user, Integer> {
}

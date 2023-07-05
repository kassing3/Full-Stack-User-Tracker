package com.kassing.usertrackerbackend.repository;

import com.kassing.usertrackerbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

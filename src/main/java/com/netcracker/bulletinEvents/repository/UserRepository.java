package com.netcracker.bulletinEvents.repository;

import com.netcracker.bulletinEvents.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

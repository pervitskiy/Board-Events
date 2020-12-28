package com.netcracker.bulletinEvents.repository;

import com.netcracker.bulletinEvents.models.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Events, Integer> {
}

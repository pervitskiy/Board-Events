package com.netcracker.bulletinEvents.repository;

import com.netcracker.bulletinEvents.models.CategoryEvents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryEventsRepository extends JpaRepository<CategoryEvents, Integer> {
}

package com.netcracker.bulletinEvents.repository;

import com.netcracker.bulletinEvents.models.EventsHasCategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsHasCategoriesRepository extends JpaRepository<EventsHasCategories, Integer> {
}

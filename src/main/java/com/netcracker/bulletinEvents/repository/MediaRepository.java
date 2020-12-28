package com.netcracker.bulletinEvents.repository;

import com.netcracker.bulletinEvents.models.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media, Integer> {
}

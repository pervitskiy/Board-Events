package com.netcracker.bulletinEvents.repository;

import com.netcracker.bulletinEvents.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}

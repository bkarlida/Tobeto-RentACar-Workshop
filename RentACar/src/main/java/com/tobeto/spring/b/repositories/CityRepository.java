package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City,Integer> {
}

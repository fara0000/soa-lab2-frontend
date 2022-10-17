package com.example.mainservice.repositories;

import com.example.mainservice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer> {
    City findCityById(Integer id);
}

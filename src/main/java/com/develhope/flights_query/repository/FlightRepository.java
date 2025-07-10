package com.develhope.flights_query.repository;

import com.develhope.flights_query.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}

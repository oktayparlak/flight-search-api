package com.oktayparlak.flightSearchApi.dataAccess.abstracts;

import com.oktayparlak.flightSearchApi.entities.concretes.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}

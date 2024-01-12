package com.oktayparlak.flightSearchApi.dataAccess.abstracts;

import com.oktayparlak.flightSearchApi.entities.concretes.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Integer>{
}

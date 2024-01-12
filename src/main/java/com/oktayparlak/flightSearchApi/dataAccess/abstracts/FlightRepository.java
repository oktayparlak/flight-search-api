package com.oktayparlak.flightSearchApi.dataAccess.abstracts;

import com.oktayparlak.flightSearchApi.entities.concretes.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    @Query("SELECT f FROM Flight f JOIN FETCH f.departureAirport JOIN FETCH f.arrivalAirport")
    List<Flight> findAll();

}

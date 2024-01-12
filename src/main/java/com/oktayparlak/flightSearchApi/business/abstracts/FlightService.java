package com.oktayparlak.flightSearchApi.business.abstracts;

import com.oktayparlak.flightSearchApi.entities.concretes.Airport;
import com.oktayparlak.flightSearchApi.entities.concretes.Flight;

import java.util.List;

public interface FlightService {

    List<Flight> getAll();
    Flight getById(Long id);
    List<Flight> search(Long departureAirportId, Long arrivalAirportId);
    void add(Flight flight);
    void update(Flight flight);
    void delete(Long id);

}

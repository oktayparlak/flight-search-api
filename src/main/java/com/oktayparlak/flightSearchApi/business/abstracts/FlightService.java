package com.oktayparlak.flightSearchApi.business.abstracts;

import com.oktayparlak.flightSearchApi.entities.concretes.Flight;

import java.util.List;

public interface FlightService {

    List<Flight> getAll();
    Flight getById(int id);
    void add(Flight flight);
    void update(Flight flight);
    void delete(Flight flight);

}

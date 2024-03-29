package com.oktayparlak.flightSearchApi.business.abstracts;

import com.oktayparlak.flightSearchApi.entities.concretes.Airport;

import java.util.List;

public interface AirportService {

    List<Airport> getAll();
    Airport getById(Long id);
    void add(Airport airport);
    void update(Airport airport);
    void delete(Long id);

}

package com.oktayparlak.flightSearchApi.business.concretes;

import com.oktayparlak.flightSearchApi.business.abstracts.FlightService;
import com.oktayparlak.flightSearchApi.dataAccess.abstracts.FlightRepository;
import com.oktayparlak.flightSearchApi.entities.concretes.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightManager implements FlightService {

    private FlightRepository flightRepository;

    @Autowired
    public FlightManager(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> getAll() {
        return this.flightRepository.findAll();
    }

    @Override
    public Flight getById(Long id) {
        return this.flightRepository.getReferenceById(Integer.parseInt(id.toString()));
    }

    @Override
    public void add(Flight flight) {
        this.flightRepository.save(flight);
    }

    @Override
    public void update(Flight flight) {
        this.flightRepository.save(flight);
    }

    @Override
    public void delete(Long id) {
        this.flightRepository.deleteById(Integer.parseInt(id.toString()));
    }
}

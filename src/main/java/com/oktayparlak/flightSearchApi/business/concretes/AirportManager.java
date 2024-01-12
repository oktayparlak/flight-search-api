package com.oktayparlak.flightSearchApi.business.concretes;

import com.oktayparlak.flightSearchApi.business.abstracts.AirportService;
import com.oktayparlak.flightSearchApi.dataAccess.abstracts.AirportRepository;
import com.oktayparlak.flightSearchApi.entities.concretes.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportManager implements AirportService {

    private AirportRepository airportRepository;

    @Autowired
    public AirportManager(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public List<Airport> getAll() {
        return this.airportRepository.findAll();
    }

    @Override
    public Airport getById(Long id) {
        return this.airportRepository.getReferenceById(Integer.parseInt(id.toString()));
    }

    @Override
    public void add(Airport airport) {
        this.airportRepository.save(airport);
    }

    @Override
    public void update(Airport airport) {
        this.airportRepository.save(airport);
    }

    @Override
    public void delete(Long id) {
        this.airportRepository.deleteById(Integer.parseInt(id.toString()));
    }
}

package com.oktayparlak.flightSearchApi.api.controllers;

import com.oktayparlak.flightSearchApi.business.abstracts.AirportService;
import com.oktayparlak.flightSearchApi.entities.concretes.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

    private AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/")
    public List<Airport> getAll() {
        return this.airportService.getAll();
    }

    @GetMapping("/id")
    public Airport getById(@RequestParam int id) {
        return this.airportService.getById(id);
    }

    @PostMapping("/")
    public void add(@RequestBody Airport airport) {
        this.airportService.add(airport);
    }

    @PatchMapping("/id")
    public void update(@RequestBody Airport airport) {
        this.airportService.update(airport);
    }

    @DeleteMapping("/id")
    public void delete(@RequestBody Airport airport) {
        this.airportService.delete(airport);
    }

}

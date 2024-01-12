package com.oktayparlak.flightSearchApi.api.controllers;

import com.oktayparlak.flightSearchApi.business.abstracts.AirportService;
import com.oktayparlak.flightSearchApi.entities.concretes.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @GetMapping("/{id}")
    public Airport getById(@PathVariable Long id) {
        return this.airportService.getById(id);
    }

    @PostMapping("/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void add(@RequestBody Airport airport) {
        this.airportService.add(airport);
    }

    @PatchMapping("/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void update(@RequestBody Airport airport) {
        this.airportService.update(airport);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void delete(@PathVariable Long id) {
        this.airportService.delete(id);
    }

}

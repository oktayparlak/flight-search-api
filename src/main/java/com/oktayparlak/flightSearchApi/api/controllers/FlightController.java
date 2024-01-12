package com.oktayparlak.flightSearchApi.api.controllers;

import com.oktayparlak.flightSearchApi.business.abstracts.FlightService;
import com.oktayparlak.flightSearchApi.entities.concretes.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/")
    public List<Flight> getAll() {
        return this.flightService.getAll();
    }

    @GetMapping("/id")
    public Flight getById(@RequestParam int id) {
        return this.flightService.getById(id);
    }

    @PostMapping("/")
    public void add(@RequestBody Flight flight) {
        this.flightService.add(flight);
    }

    @PatchMapping("/id")
    public void update(@RequestBody Flight flight) {
        this.flightService.update(flight);
    }

    @DeleteMapping("/id")
    public void delete(@RequestBody Flight flight) {
        this.flightService.delete(flight);
    }
}

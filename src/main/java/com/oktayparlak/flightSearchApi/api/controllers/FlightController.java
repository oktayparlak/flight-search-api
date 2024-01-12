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

    @GetMapping("/{id}")
    public Flight getById(@PathVariable Long id) {
        return this.flightService.getById(id);
    }

    @GetMapping("/search")
    public List<Flight> search(@RequestParam Long departureAirportId, @RequestParam Long arrivalAirportId) {
        return this.flightService.search(departureAirportId, arrivalAirportId);
    }

    @PostMapping("/")
    public void add(@RequestBody Flight flight) {
        this.flightService.add(flight);
    }

    @PatchMapping("/")
    public void update(@RequestBody Flight flight) {
        this.flightService.update(flight);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.flightService.delete(id);
    }
}

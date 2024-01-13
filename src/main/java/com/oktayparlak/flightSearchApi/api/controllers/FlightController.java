package com.oktayparlak.flightSearchApi.api.controllers;

import com.oktayparlak.flightSearchApi.business.abstracts.FlightService;
import com.oktayparlak.flightSearchApi.entities.concretes.Airport;
import com.oktayparlak.flightSearchApi.entities.concretes.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
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

//    @GetMapping("/search")
//    public List<Flight> search(@RequestBody Airport departureAirport, @RequestBody Airport arrivalAirport, @RequestBody Date departureDate) {
//        return this.flightService.search(departureAirport, arrivalAirport, departureDate);
//    }
    @GetMapping("/search")
    public List<Flight> searchWithArrivalDate(@RequestParam Long departureAirportId, @RequestParam Long arrivalAirportId, @RequestParam LocalDateTime departureDate, @RequestParam(required = false) LocalDateTime arrivalDate) {
        System.out.println("arrivalDate: " + arrivalDate);
        return arrivalDate == null ? this.flightService.search(departureAirportId, arrivalAirportId, departureDate) : this.flightService.search(departureAirportId, arrivalAirportId, departureDate, arrivalDate);
    }

    @PostMapping("/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void add(@RequestBody Flight flight) {
        this.flightService.add(flight);
    }

    @PatchMapping("/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void update(@RequestBody Flight flight) {
        this.flightService.update(flight);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void delete(@PathVariable Long id) {
        this.flightService.delete(id);
    }
}

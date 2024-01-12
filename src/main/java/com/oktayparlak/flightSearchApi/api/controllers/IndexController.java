package com.oktayparlak.flightSearchApi.api.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String index() {
        return "Welcome to Flight Search API";
    }

}

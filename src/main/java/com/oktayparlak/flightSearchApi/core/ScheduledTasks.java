package com.oktayparlak.flightSearchApi.core;

import java.security.Timestamp;
import java.text.SimpleDateFormat;

import com.oktayparlak.flightSearchApi.entities.concretes.Airport;
import com.oktayparlak.flightSearchApi.entities.concretes.Flight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 24 * 60 * 60 * 1000) // 24 hours
    public void pullData() {
        System.out.println("Flight data pulled from the API.");
    }
}

package com.oktayparlak.flightSearchApi.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "flights")
@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "departureAirport")
    private int departureAirport;

    @Column(name = "arrivalAirport")
    private int arrivalAirport;

    @Column(name = "departureDate")
    private Date departureDate;

    @Column(name = "arrivalDate")
    private Date arrivalDate;

}

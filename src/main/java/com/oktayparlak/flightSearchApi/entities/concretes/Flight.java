package com.oktayparlak.flightSearchApi.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "flights")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne(targetEntity = Airport.class)
    @JoinColumn(name = "departureAirport", referencedColumnName = "id")
    private Airport departureAirport;

    @ManyToOne(targetEntity = Airport.class)
    @JoinColumn(name = "arrivalAirport", referencedColumnName = "id")
    private Airport arrivalAirport;

    @Column(name = "departureDate")
    private LocalDateTime departureDate;

    @Column(name = "arrivalDate")
    private LocalDateTime arrivalDate;

}

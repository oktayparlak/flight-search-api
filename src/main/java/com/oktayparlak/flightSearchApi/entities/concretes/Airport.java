package com.oktayparlak.flightSearchApi.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "airports")
public class Airport {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "city")
    private String city;


}

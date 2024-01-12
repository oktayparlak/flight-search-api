package com.oktayparlak.flightSearchApi.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "airports")
@Entity
public class Airport {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;


}

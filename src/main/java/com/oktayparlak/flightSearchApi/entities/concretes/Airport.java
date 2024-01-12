package com.oktayparlak.flightSearchApi.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "airports")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Airport {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "city")
    private String city;


}

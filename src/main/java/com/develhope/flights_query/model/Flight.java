package com.develhope.flights_query.model;


import jakarta.persistence.*;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String description;

    @Column(length = 50)
    private String fromAirport;
    @Column(length = 50)
    private String toAirport;
}

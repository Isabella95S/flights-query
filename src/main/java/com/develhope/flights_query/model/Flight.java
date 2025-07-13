package com.develhope.flights_query.model;


import com.develhope.flights_query.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Setter
@Getter
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


    @Enumerated(EnumType.STRING)
    @NotNull
    @Column
    private Status status;

    private Flight() {

    }
}
